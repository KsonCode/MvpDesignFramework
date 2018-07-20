package com.example.kson.library.base.base;

/**
 * Author:kson
 * E-mail:19655910@qq.com
 * Time:2018/03/15
 * Description:
 */
public abstract class BaseMvpActivity<P extends BasePresenter, M extends IBaseModel> extends BaseActivity implements IBaseView {

    public P presenter;
    public M model;

    @Override
    protected void initData() {
        super.initData();

        presenter = (P) initPresenter();
        if (presenter != null) {

            model = (M) presenter.getmModel();

            if (model != null) {

                presenter.attatch(model, this);
            }
        }

    }

    /**
     * 内存优化
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.dettach();
        }
    }
}
