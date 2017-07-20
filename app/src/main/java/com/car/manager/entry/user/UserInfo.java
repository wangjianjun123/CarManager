package com.car.manager.entry.user;

/**
 * @author kele
 * @data on 2017/7/17 下午9:37
 * @description 用户信息
 */

public class UserInfo {

    private String carNumber;

    private String phone;

    private String name;

    private String appId;

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
