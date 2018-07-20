package com.example.kson.library.base.base;

import android.support.annotation.NonNull;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public interface IBaseView {

    @NonNull
    BasePresenter initPresenter();

    void fail();

    void showLoadingDialog();

    void hideLoadingDialog();
}
