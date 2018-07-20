package com.example.kson.mvpdesignframework.api;

import com.example.kson.mvpdesignframework.bean.UserBean;
import com.example.kson.mvpdesignframework.constants.ApiConstants;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public interface UserApi {

    @POST(ApiConstants.LOGIN_URL)
    @FormUrlEncoded
    Observable<UserBean> login(@FieldMap Map<String,String> params);
}
