package com.car.manager.module.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.car.manager.R;
import com.car.manager.base.RxBaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends RxBaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {

    }

    @Override
    public void initToolBar() {
        mToolbar.setTitle("主页");
    }

    @OnClick(R.id.btnMessage)
    void onMessageClick() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MessageActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnOut)
    void onOutClick() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, OutActivity.class);
        startActivity(intent);
    }


    @OnClick(R.id.btnIn)
    void onInClick() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, InActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnRecord)
    void onRecordClick() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, RecordActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnSetting)
    void onSettingClick() {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, SettingActivity.class);
        startActivity(intent);
    }
}
