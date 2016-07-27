package qiaofei.com.coderinfoa.injector.component;

import android.app.Activity;
import android.content.Context;
import dagger.Component;
import qiaofei.com.coderinfoa.injector.moudle.ActivityModule;
import qiaofei.com.coderinfoa.utils.network.NetworkApi;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;
import qiaofei.com.coderinfoa.injector.scopes.PerActivity;

/**
 * Created by QiaoFei on 2016/6/8.
 */
@PerActivity @Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
  //void inject(LoginActivity loginActivity);

  NetworkApi getNetworkApi();

  @ContextLife("Activity") Context getActivityContext();

  @ContextLife("Application") Context getApplicationContext();

  Activity getActivity();
}
