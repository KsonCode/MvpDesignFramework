package com.example.kson.library.base.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initView(savedInstanceState);
        initData();

    }

    /**
     * 初始化数据
     */
    protected void initData() {

        mProgressDialog = new ProgressDialog(this);

    }

    //初始化view控件
    protected abstract void initView(Bundle savedInstanceState);

    //绑定布局控件的方法
    protected abstract int getLayoutId();


    /**
     * 无参数跳转
     *
     * @param clz
     */
    public void startActivity(Class<?> clz) {

        startActivity(new Intent(this, clz));

    }

    /**
     * 有值跳转
     *
     * @param clz
     */
    public void startActivity(Class<?> clz, Bundle bundle) {

        Intent intent = new Intent(this, clz);
        intent.putExtras(bundle);
        startActivity(intent);

    }

    /**
     * 显示加载框
     * @param msg
     */
    public void showLoadingDialog(String msg){
        if (mProgressDialog!=null){
            mProgressDialog.setMessage(msg);
            mProgressDialog.show();
        }
    }
    /**
     * 隐藏加载框
     */
    public void hideLoadingDialog(){
        if (mProgressDialog!=null){
          mProgressDialog.dismiss();
//          mProgressDialog.hide();
        }
    }


}
