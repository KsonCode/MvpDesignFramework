package com.example.kson.library.base.base;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public abstract class BasePresenter<M, V> {

    public M mModel;
    public V mView;

    public abstract M getmModel();

    public void attatch(M m, V v) {
        this.mModel = m;
        this.mView = v;
    }

    /**
     * 避免内存泄漏
     */
    public void dettach() {
        this.mModel = null;
        this.mView = null;
    }


}
