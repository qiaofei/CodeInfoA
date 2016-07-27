package qiaofei.com.coderinfoa.views.user.main;

import android.os.Bundle;
import qiaofei.com.coderinfoa.R;
import qiaofei.com.coderinfoa.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainContract.MvpView {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override protected int getLayoutId() {
    return R.layout.activity_main;
  }

  @Override public void initInjector() {

  }

  @Override public void login() {

  }
}
