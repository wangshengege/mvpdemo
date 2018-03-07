package org.mvplib.di.component;

import org.mvplib.di.module.ApiModule;
import org.mvplib.model.api.ApiService;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Author: ws.
 * Date: 2018/3/5.
 * Description: //TODO
 */
@Component(modules = ApiModule.class)
@Singleton
public interface ApiComponent {
    OkHttpClient getOkHttp();
    Retrofit getRetrofit();
    ApiService provideApiService();
}
