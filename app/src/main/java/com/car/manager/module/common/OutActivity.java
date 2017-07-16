package com.car.manager.module.common;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.car.manager.R;
import com.car.manager.base.RxBaseActivity;

import butterknife.BindView;

public class OutActivity extends RxBaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_out;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initToolBar() {
        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black);
        mToolbar.setTitle("出车");
        mToolbar.setNavigationOnClickListener(view -> finish());
    }
}
