package org.mvplib.model.api;

import org.mvplib.model.bean.GoodBean;

import java.util.List;

import retrofit2.adapter.rxjava.Result;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Author: ws.
 * Date: 2018/3/5.
 * Description: //TODO
 */

public interface ApiService {
    @GET("api/v1/goods/recommend/list/{id}")
    Observable<Result<GoodBean>> getGoodsByType(@Path("id")int id);
}
