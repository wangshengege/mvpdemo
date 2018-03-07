package org.mvplib.app;

import android.app.Application;
import android.content.Context;

import org.mvplib.MainActivity;
import org.mvplib.di.component.ApiComponent;
import org.mvplib.di.component.DaggerApiComponent;
import org.mvplib.di.module.ApiModule;
import org.mvplib.view.base.AbstractBaseActivity;
import org.mvplib.utils.FileAccessor;

import java.util.LinkedList;
import java.util.List;

/**
 * Author: ws.
 * Date: 2018/3/5.
 * Description: //TODO
 */
public class MvpApplication extends Application {
    protected static Context ctx;
    private CrashHandler crashHandler;
    private ApiComponent appComponent;
    /** 获取全局的上下文 */
    public static Context getContext() {
        return ctx;
    }

    public ApiComponent getApiComponent() {
        return appComponent;
    }

    public void setApiComponent(ApiComponent appComponent) {
        this.appComponent = appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        ctx = getApplicationContext();
        crashHandler=CrashHandler.getInstance();
        crashHandler.init(ctx, MainActivity.class);
        FileAccessor.initFileAccess();//初始化文件夹
        appComponent= DaggerApiComponent.builder().apiModule(new ApiModule()).build();
    }


    /** 记录所有打开的Activity，用于退出 */
    private List<AbstractBaseActivity> activitys = null;

    // 添加Activity到容器中
    public void addActivity(AbstractBaseActivity activity) {
        if (activitys == null) {
            activitys = new LinkedList<AbstractBaseActivity>();
        }

        if (activitys != null && activitys.size() > 0) {
            if (!activitys.contains(activity)) {
                activitys.add(activity);
            }
        } else {
            activitys.add(activity);
        }
    }
    /**
     * 溢出Activity
     * */
    public void removeActivity(AbstractBaseActivity activity) {
        if (activitys != null && activitys.size() > 0) {
            if (activitys.contains(activity)) {
                activitys.remove(activity);
            }
        }
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        System.gc();
    }
    /**
     * 获取所有Activity
     *
     * @return
     */
    public List<AbstractBaseActivity> getActivitys() {
        return activitys;
    }

    // 遍历所有Activity并finish
    public void exit() {
        if (activitys != null && activitys.size() > 0) {
            for (AbstractBaseActivity activity : activitys) {
                if (activity != null) {
                    activity.finish();
                }
            }
        }
        System.exit(0);
    }
}
