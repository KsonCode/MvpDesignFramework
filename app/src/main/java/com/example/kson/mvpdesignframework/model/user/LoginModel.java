package com.example.kson.mvpdesignframework.model.user;

import com.example.kson.mvpdesignframework.api.UserApi;
import com.example.kson.mvpdesignframework.bean.UserBean;
import com.example.kson.mvpdesignframework.constants.ApiConstants;
import com.example.kson.mvpdesignframework.contract.user.LoginContract;
import com.example.kson.mvpdesignframework.utils.RetrofitUtils;

import java.util.Map;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public class LoginModel implements LoginContract.ILoginModel {
    @Override
    public Observable<UserBean> login(Map<String, String> params) {
        return RetrofitUtils.createApi(UserApi.class, ApiConstants.BASE_URL)
                .login(params).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
}
