package com.example.kson.mvpdesignframework.presenter.user;

import com.example.kson.mvpdesignframework.bean.UserBean;
import com.example.kson.mvpdesignframework.contract.user.LoginContract;

import java.util.Map;

import io.reactivex.functions.Consumer;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public class LoginPresenter extends LoginContract.LoginPresenter {

    @Override
    public void login(Map<String, String> params) {



        mModel.login(params).subscribe(new Consumer<UserBean>() {
            @Override
            public void accept(UserBean userBean) throws Exception {
                mView.success(userBean);
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mView.fail();
            }
        });
    }

    @Override
    public void verify(String mobile, String pass) {

    }


}
