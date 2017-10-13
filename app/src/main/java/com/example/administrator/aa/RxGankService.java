package com.example.administrator.aa;


import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Administrator on 2017/10/11.
 */

public interface RxGankService {
//    http://gank.io/api/data/Android/10/1
     @GET("Android/10/{page}")
     Observable<GankResultBean> getAndroidData(@Path("page") int page);


//    @GET("all/20/{page}")
//    Observable<GankResultBean> getAndroidData(@Path("page") int page);
}



