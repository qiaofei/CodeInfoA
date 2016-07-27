package qiaofei.com.coderinfoa.views.user.main;

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

public class MainPresenter implements MainContract.MvpPresenter {

  private Context mContext;
  private MainContract.MvpView mView;
  @Inject NetworkApi networkApi;

  @Inject public MainPresenter(@ContextLife("Activity") Context context) {
    mContext = context;
  }

  /**
   * 登陆
   */
  public void login(final HashMap hashMap) {

  }

  @Override public void attachView(@NonNull IView iView) {
    mView = (MainContract.MvpView) iView;
  }

  @Override public void detachView() {

  }

  @Override public void initPresenter() {
    MyApp.mAppComponent.inject(this);
  }
}
