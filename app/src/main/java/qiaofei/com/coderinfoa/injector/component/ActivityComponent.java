package qiaofei.com.coderinfoa.injector.component;

import android.app.Activity;
import android.content.Context;
import dagger.Component;
import qiaofei.com.coderinfoa.injector.moudle.ActivityModule;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;
import qiaofei.com.coderinfoa.injector.scopes.PerActivity;
import qiaofei.com.coderinfoa.utils.network.NetworkApi;
import qiaofei.com.coderinfoa.views.user.login.LoginActivity;
import qiaofei.com.coderinfoa.views.user.main.MainActivity;

/**
 * Created by QiaoFei on 2016/6/8.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
  void inject(LoginActivity loginActivity);

  void inject(MainActivity mainActivity);

  NetworkApi getNetworkApi();

  @ContextLife("Activity") Context getActivityContext();

  @ContextLife("Application") Context getApplicationContext();

  Activity getActivity();
}
