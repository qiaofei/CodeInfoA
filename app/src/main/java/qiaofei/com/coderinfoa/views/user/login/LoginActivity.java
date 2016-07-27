package qiaofei.com.coderinfoa.views.user.login;

import javax.inject.Inject;
import qiaofei.com.coderinfoa.R;
import qiaofei.com.coderinfoa.base.BaseActivity;

/**
 * Created by Administrator on 2015/9/19.
 */
public class LoginActivity extends BaseActivity implements LoginContract.MvpView {
  @Inject LoginPresenter loginPresenter;

  protected int getLayoutId() {
    return R.layout.activity_main;
  }

  @Override public void initInjector() {
    mActivityComponent.inject(this);
    loginPresenter.attachView(this);
  }

  @Override public void initData() {
  }

  @Override public void login() {

  }
}
