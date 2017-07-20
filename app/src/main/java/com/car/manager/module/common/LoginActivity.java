package com.car.manager.module.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.widget.EditText;

import com.car.manager.R;
import com.car.manager.base.RxBaseActivity;
import com.car.manager.utils.CommonUtil;
import com.car.manager.utils.ToastUtil;

import java.io.IOException;

import butterknife.BindView;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class LoginActivity extends RxBaseActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.etUserName)
    EditText etUserName;

    @BindView(R.id.etCarNo)
    EditText etCarNo;

    @BindView(R.id.etPhone)
    EditText etPhone;

    public static final String TAG = "LoginActivity";

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
        String strCarNo = etCarNo.getText().toString();
        String strPhone = etPhone.getText().toString();

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

        addUser(strUserName, strCarNo, strPhone);

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }


    private void addUser(String userName, String carNo, String phone) {
//        RetrofitHelper.getBaseAPI()
//                .addUser(carNo, phone, userName, "111111")
//                .compose(bindToLifecycle())
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(listBeans ->
//                        Log.w("sss", listBeans.toString()),
//                        throwable -> {
//                });

        OkHttpClient client = new OkHttpClient();
        FormBody formBody = new FormBody.Builder()
                .add("carNumber", carNo)
                .add("phone", phone)
                .add("name", userName)
                .add("appId", CommonUtil.getImei())
                .build();
        Request request = new Request.Builder().url("http://47.95.0.218:8080/core/api/user/add")
                .post(formBody)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.w(TAG, e.toString());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.w(TAG, response.body().string());
            }
        });
    }

}
