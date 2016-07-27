package qiaofei.com.coderinfoa.base;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import butterknife.ButterKnife;
import java.util.LinkedList;
import qiaofei.com.coderinfoa.injector.component.ActivityComponent;
import qiaofei.com.coderinfoa.injector.component.DaggerActivityComponent;
import qiaofei.com.coderinfoa.injector.moudle.ActivityModule;

/**
 * Created by Administrator on 2015/9/19.
 */
public abstract class BaseActivity extends AppCompatActivity {
  public static LinkedList<Activity> sAllActivitys = new LinkedList<Activity>();
  protected ActivityComponent mActivityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    // 锁定竖屏
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    super.onCreate(savedInstanceState);
    if ((getIntent().getFlags() & Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT) != 0) {
      finish();
      return;
    }
    if (getLayoutId() != 0) {
      setContentView(getLayoutId());
    }
    sAllActivitys.add(this);
    ButterKnife.bind(this);
    mActivityComponent = DaggerActivityComponent.builder()
        .appComponent(MyApp.mAppComponent)
        .activityModule(new ActivityModule(this))
        .build();
    initInjector();
    initData();
  }

  /**
   * 注入Injector
   */
  public abstract void initInjector();

  public void initData() {
  }

  protected int getLayoutId() {
    return 0;
  }

  protected void onDestroy() {
    ButterKnife.unbind(this);
    super.onDestroy();
  }

  public void closeAllActivity() {
    for (Activity activity : sAllActivitys) {
      activity.finish();
      sAllActivitys.remove(activity);
    }
  }

  public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
      case android.R.id.home:
        this.finish();
        break;
    }
    return super.onOptionsItemSelected(item);
  }
}
