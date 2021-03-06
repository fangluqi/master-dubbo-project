package com.sorfwore.zgd.dubbo.user.dto;

import com.sorfwore.zgd.dubbo.user.abs.AbstractResponse;

import java.io.Serializable;

/**
 * @author 风骚的GRE
 * @date 2018/1/18.
 */
public class UserLoginResponse extends AbstractResponse implements Serializable{
    private static final long serialVersionUID = -4265433618227259028L;
    private String realName;

    private String avatar;

    private String mobile;

    private String sex;

    private String token;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserLoginResponse{" +
                "realName='" + realName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", mobile='" + mobile + '\'' +
                ", sex='" + sex + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
