package com.example.kson.mvpdesignframework.contract.user;

import com.example.kson.library.base.base.BasePresenter;
import com.example.kson.library.base.base.IBaseModel;
import com.example.kson.library.base.base.IBaseView;
import com.example.kson.mvpdesignframework.bean.UserBean;
import com.example.kson.mvpdesignframework.model.user.LoginModel;

import java.util.Map;

import io.reactivex.Observable;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:登录contract类，
 */
public interface LoginContract {


    abstract class LoginPresenter extends BasePresenter<ILoginModel,ILoginView> {


        @Override
        public ILoginModel getmModel() {
            return new LoginModel();
        }

        public abstract void login(Map<String,String> params);
        public abstract void verify(String mobile,String pass);

    }


    interface  ILoginModel extends IBaseModel {

        Observable<UserBean> login(Map<String,String> params);

    }


    interface ILoginView extends IBaseView {

        void success(UserBean userBean);


    }



}
