package qiaofei.com.coderinfoa.injector.moudle;

import android.app.Activity;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;
import qiaofei.com.coderinfoa.injector.scopes.PerActivity;

/**
 * Created by QiaoFei on 2016/6/8.
 */
@Module public class ActivityModule {

  private Activity mActivity;

  public ActivityModule(Activity activity) {
    this.mActivity = activity;
  }

  @Provides @PerActivity @ContextLife("Activity") public Context provideContext() {
    return mActivity;
  }

  @Provides @PerActivity public Activity provideActivity() {
    return mActivity;
  }
}
