package org.mvplib.di.module;

import org.mvplib.presenter.MainContract;

import dagger.Module;
import dagger.Provides;

/**
 * Author: ws.
 * Date: 2018/3/7.
 * Description: //TODO
 */
@Module
public class ActModule {
    private MainContract.View mView;

    public ActModule(MainContract.View mView) {
        this.mView = mView;
    }
    @Provides
    public MainContract.View provideView(){
        return mView;
    }
}
