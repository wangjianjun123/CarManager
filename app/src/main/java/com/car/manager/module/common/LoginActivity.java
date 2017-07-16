package com.car.manager.module.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.EditText;

import com.car.manager.R;
import com.car.manager.base.RxBaseActivity;
import com.car.manager.utils.ToastUtil;

import butterknife.BindView;
import butterknife.OnClick;


public class LoginActivity extends RxBaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.etUserName)
    EditText etUserName;

    @BindView(R.id.etCarNo)
    EditText etCarNo;

    @BindView(R.id.etPhone)
    EditText etPhone;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initToolBar() {
        mToolbar.setNavigationIcon(R.drawable.ic_cancle);
        mToolbar.setTitle("登录");
        mToolbar.setNavigationOnClickListener(view -> finish());
    }

    @OnClick(R.id.btnLogin)
    void login() {
        String strUserName = etUserName.getText().toString();
        String strCarNo = etUserName.getText().toString();
        String strPhone = etUserName.getText().toString();

        if (TextUtils.isEmpty(strUserName)) {
            ToastUtil.ShortToast("驾驶员姓名不能为空");
            return;
        }
        if (TextUtils.isEmpty(strCarNo)) {
            ToastUtil.ShortToast("车牌号不能为空");
            return;
        }
        if (TextUtils.isEmpty(strPhone)) {
            ToastUtil.ShortToast("手机号不能为空");
            return;
        }

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }

}
