package org.mvplib.presenter;

import org.mvplib.model.api.ApiService;
import org.mvplib.model.bean.GoodBean;
import org.mvplib.utils.LogTools;

import java.util.List;

import javax.inject.Inject;

import retrofit2.adapter.rxjava.Result;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Author: ws.
 * Date: 2018/3/7.
 * Description: //TODO
 */

public class MainPersenter implements MainContract.Persenter{
    MainContract.View veiw;
    ApiService apiService;
    @Inject
    public MainPersenter(MainContract.View veiw, ApiService apiService) {
        this.veiw=veiw;
        this.apiService=apiService;

    }
    @Override
    public void loadData() {
        apiService.getGoodsByType(1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Result<List<GoodBean>>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        LogTools.i("Main",e.getMessage());
                    }

                    @Override
                    public void onNext(Result<List<GoodBean>> listResult) {
                       // LogTools.i("Main",listResult.response().body().toString());
                    }
                });
    }
}
