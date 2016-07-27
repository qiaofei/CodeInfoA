package qiaofei.com.coderinfoa.views.user.login;

import android.content.Context;
import android.support.annotation.NonNull;
import java.util.HashMap;
import javax.inject.Inject;
import qiaofei.com.coderinfoa.base.IView;
import qiaofei.com.coderinfoa.base.MyApp;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;
import qiaofei.com.coderinfoa.utils.network.NetworkApi;

/**
 * Created by QiaoFei on 2016/6/6.
 */

public class LoginPresenter implements LoginContract.MvpPresenter {

  private Context mContext;
  private LoginContract.MvpView mView;
  @Inject NetworkApi networkApi;

  @Inject public LoginPresenter(@ContextLife("Activity") Context context) {
    mContext = context;
  }

  /**
   * 登陆
   */
  public void login(final HashMap hashMap) {

  }

  @Override public void attachView(@NonNull IView iView) {
    mView = (LoginContract.MvpView) iView;
  }

  @Override public void detachView() {

  }

  @Override public void initPresenter() {
    MyApp.mAppComponent.inject(this);
  }
}
