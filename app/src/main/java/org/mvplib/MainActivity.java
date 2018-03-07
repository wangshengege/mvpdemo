package org.mvplib;

import android.os.Bundle;

import org.mvplib.di.component.DaggerActComponent;
import org.mvplib.di.module.ActModule;
import org.mvplib.presenter.MainContract;
import org.mvplib.presenter.MainPersenter;
import org.mvplib.view.base.AbstractBaseActivity;
import org.mvplib.utils.LogTools;

import javax.inject.Inject;

public class MainActivity extends AbstractBaseActivity implements MainContract.View {
    @Inject
    MainPersenter mainPersenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       DaggerActComponent.builder()
                .actModule(new ActModule(this))
                .apiComponent(myApplication.getApiComponent())
                .build()
                .inject(this);
        if (mainPersenter == null) {
            LogTools.d("Main", "is null");
        } else {
            mainPersenter.loadData();
        }
    }
}
