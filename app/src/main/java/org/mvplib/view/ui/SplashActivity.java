package org.mvplib.view.ui;


import android.content.Intent;
import android.os.Bundle;

import org.mvplib.R;
import org.mvplib.view.base.AbstractBaseActivity;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.Observer;

public class SplashActivity extends AbstractBaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Observable.timer(3, TimeUnit.SECONDS)
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onCompleted() {
                        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Long aLong) {

                    }
                });
    }
}

