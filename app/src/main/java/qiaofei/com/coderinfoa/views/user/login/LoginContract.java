package qiaofei.com.coderinfoa.views.user.login;

import java.util.HashMap;
import qiaofei.com.coderinfoa.base.IPresenter;
import qiaofei.com.coderinfoa.base.IView;

/**
 * Created by QiaoFei on 2016/6/6.
 */

public interface LoginContract {
    interface MvpView extends IView {
        void login();
    }

    interface MvpPresenter extends IPresenter {
        void login(HashMap hashMap);
    }
}
