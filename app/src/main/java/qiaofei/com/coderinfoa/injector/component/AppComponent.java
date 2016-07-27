package qiaofei.com.coderinfoa.injector.component;

import android.content.Context;
import dagger.Component;
import javax.inject.Singleton;
import qiaofei.com.coderinfoa.injector.moudle.AppModule;
import qiaofei.com.coderinfoa.injector.moudle.NetworkModule;
import qiaofei.com.coderinfoa.utils.network.NetworkApi;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;

/**
 * Created by QiaoFei on 2016/6/7.
 */
@Singleton @Component(modules = { AppModule.class, NetworkModule.class })
public interface AppComponent {
  //void inject(LoginPresenter loginPresenter);

  @ContextLife("Application") Context getContext();

  NetworkApi getNetworkApi();
}
