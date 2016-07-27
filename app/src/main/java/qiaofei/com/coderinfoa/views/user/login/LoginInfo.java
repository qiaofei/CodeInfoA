package qiaofei.com.coderinfoa.views.user.login;

import java.io.Serializable;

/**
 * Created by QiaoFei on 2016/6/6.
 */

public class LoginInfo implements Serializable {
    private String loginToken;
    private String userId;
    private String loginDate;
    private String phoneNum;

    public LoginInfo(String loginToken, String userId, String loginDate, String phoneNum) {
        this.loginToken = loginToken;
        this.userId = userId;
        this.loginDate = loginDate;
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginToken() {
        return loginToken;
    }

    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
