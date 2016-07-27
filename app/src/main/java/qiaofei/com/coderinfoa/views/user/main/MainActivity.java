package qiaofei.com.coderinfoa.views.user.main;

import qiaofei.com.coderinfoa.R;
import qiaofei.com.coderinfoa.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainContract.MvpView {

  @Override public int setContent() {
    return R.layout.activity_main;
  }

  @Override public void initInjector() {
    mActivityComponent.inject(this);
  }

  @Override public void initData() {

  }

  @Override public void login() {

  }
}
