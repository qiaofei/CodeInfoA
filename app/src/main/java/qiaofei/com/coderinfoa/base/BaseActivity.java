package qiaofei.com.coderinfoa.base;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import qiaofei.com.coderinfoa.injector.component.ActivityComponent;
import qiaofei.com.coderinfoa.injector.component.DaggerActivityComponent;
import qiaofei.com.coderinfoa.injector.moudle.ActivityModule;

/**
 * Created by Administrator on 2015/9/19.
 */
public abstract class BaseActivity extends RxAppCompatActivity {

  protected ActivityComponent mActivityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setActivityStatus();
    //requestWindowFeature(Window.FEATURE_NO_TITLE);
    if (setContent() != 0) {
      setContentView(setContent());
    }
    ButterKnife.bind(this);
    setActivityStatus();
    initComponent();
    initInjector();
    initData();
  }

  /**
   * 将当前Activity加入Activity列表中,并设置Activity属性
   */
  public void setActivityStatus() {
    MyApp.allActivities.add(this);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
      finish();
      return;
    }
  }

  /**
   * 初始化ActivityComponent
   */
  public void initComponent() {
    mActivityComponent = DaggerActivityComponent.builder()
        .appComponent(MyApp.mAppComponent)
        .activityModule(new ActivityModule(this))
        .build();
  }

  /**
   * 注入Injector
   */

  public abstract int setContent();

  public abstract void initInjector();

  public abstract void initData();

  /**
   * Toast 快捷方式
   */
  public void showToast(String text) {
    if (text != null && !text.trim().equals("")) {
      Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
  }

  protected void onDestroy() {
    MyApp.allActivities.remove(this);
    ButterKnife.unbind(this);
    super.onDestroy();
  }

/*
  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case android.R.id.home:
        this.finish();
        break;
    }
    return super.onOptionsItemSelected(item);
  }*/
}
