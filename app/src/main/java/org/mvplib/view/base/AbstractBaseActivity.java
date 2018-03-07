package org.mvplib.view.base;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.zhy.autolayout.AutoLayoutActivity;

import org.mvplib.app.MvpApplication;


/**
 * 所有Activity的基类
 * */
public abstract class AbstractBaseActivity extends AutoLayoutActivity {
	/** BApplication对象 */
	protected MvpApplication myApplication;
	protected AbstractBaseActivity self;
	/**是否跳转登录*/
	protected boolean isAutoLogin=true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// 取消标题栏
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		myApplication= (MvpApplication) getApplication();
		myApplication.addActivity(this);
		self=this;
		//initBaidu();
	}
	//预留百度统计
	private void initBaidu(){
	}
	/**开启沉浸栏
	 * @param on 是否开启
	 * */
	public void setTranslucentStatus(boolean on) {
		if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
			return;
		}
		Window win = getWindow();
		WindowManager.LayoutParams winParams = win.getAttributes();
		final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
		if (on) {
			winParams.flags |= bits;
		} else {
			winParams.flags &= ~bits;
		}
		win.setAttributes(winParams);
	}
	/**
	 * 设置状态栏是不是暗色，api23以上有效
	 * */
	public void setDarkStatusIcon(boolean bDark) {
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
			View decorView = getWindow().getDecorView();
			if(decorView != null){
				int vis = decorView.getSystemUiVisibility();
				if(bDark){
					vis |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
				} else{
					vis &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
				}
				decorView.setSystemUiVisibility(vis);
			}
		}
	}
	@Override
	protected void onDestroy() {
		super.onDestroy();
		myApplication.removeActivity(this);
		System.gc();
	}
}
