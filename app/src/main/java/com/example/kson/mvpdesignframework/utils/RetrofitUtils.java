package com.example.kson.mvpdesignframework.utils;

import com.example.kson.mvpdesignframework.api.UserApi;
import com.example.kson.mvpdesignframework.constants.ApiConstants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:retrofit工具类
 */
public class RetrofitUtils {

    public static <T> T createApi(Class<T> clz, String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
//        UserApi userApi = retrofit.create(UserApi.class);

        return retrofit.create(clz);

    }

}
