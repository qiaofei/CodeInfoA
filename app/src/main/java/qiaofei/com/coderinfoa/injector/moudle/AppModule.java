package qiaofei.com.coderinfoa.injector.moudle;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import qiaofei.com.coderinfoa.base.MyApp;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;

/**
 * Created by QiaoFei on 2016/6/7.
 */

@Module public class AppModule {
  private MyApp trailerApp;

  public AppModule(MyApp trailerApp) {
    this.trailerApp = trailerApp;
  }

  @Provides @Singleton @ContextLife("Application") public Context provideContext() {
    return trailerApp.getApplicationContext();
  }
}
