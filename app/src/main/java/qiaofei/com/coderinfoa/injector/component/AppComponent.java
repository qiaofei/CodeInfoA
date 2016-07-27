package qiaofei.com.coderinfoa.injector.component;

import android.content.Context;
import dagger.Component;
import javax.inject.Singleton;
import qiaofei.com.coderinfoa.injector.moudle.AppModule;
import qiaofei.com.coderinfoa.injector.moudle.NetworkModule;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;
import qiaofei.com.coderinfoa.utils.network.NetworkApi;
import qiaofei.com.coderinfoa.views.user.login.LoginPresenter;
import qiaofei.com.coderinfoa.views.user.main.MainPresenter;

/**
 * Created by QiaoFei on 2016/6/7.
 */
@Singleton @Component(modules = { AppModule.class, NetworkModule.class })
public interface AppComponent {
  void inject(LoginPresenter loginPresenter);

  void inject(MainPresenter mainPresenter);

  @ContextLife("Application") Context getContext();

  NetworkApi getNetworkApi();
}
