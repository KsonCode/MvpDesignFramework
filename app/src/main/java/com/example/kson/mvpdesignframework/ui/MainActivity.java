package com.example.kson.mvpdesignframework.ui;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.kson.library.base.base.BaseMvpActivity;
import com.example.kson.library.base.base.BasePresenter;
import com.example.kson.mvpdesignframework.R;
import com.example.kson.mvpdesignframework.bean.UserBean;
import com.example.kson.mvpdesignframework.contract.user.LoginContract;
import com.example.kson.mvpdesignframework.presenter.user.LoginPresenter;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends BaseMvpActivity<LoginContract.LoginPresenter, LoginContract.ILoginModel> implements LoginContract.ILoginView {


    @BindView(R.id.login)
    Button login;

    @NonNull
    @Override
    public BasePresenter initPresenter() {
        return new LoginPresenter();
    }

    @Override
    public void fail() {
        Toast.makeText(this, "网络可能有问题，请稍后再试", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void showLoadingDialog() {


    }

    @OnClick(R.id.login)
    public void click(View view) {
//        Toast.makeText(this, "====", Toast.LENGTH_SHORT).show();

        Map<String, String> params = new HashMap<>();
        params.put("mobile", "18612991023");
        params.put("password", "222222");
        presenter.login(params);
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void success(UserBean userBean) {

        Toast.makeText(this, userBean.msg, Toast.LENGTH_SHORT).show();

    }
}
