package com.car.manager.network.api;

import com.car.manager.entry.user.UserInfo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * @author kele
 * @data on 2017/7/17 下午9:32
 * @description API
 */

public interface ApiService {

    /**
     * 视频评论
     */
    @GET("api/user/add")
    Observable<UserInfo> addUser(@Query("carNumber") String carNumber, @Query("phone") String phone,
                                 @Query("name") String name, @Query("appId") String appId);

}
