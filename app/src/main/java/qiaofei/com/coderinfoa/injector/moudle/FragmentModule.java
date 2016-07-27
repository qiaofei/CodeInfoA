package qiaofei.com.coderinfoa.injector.moudle;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import dagger.Module;
import dagger.Provides;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;
import qiaofei.com.coderinfoa.injector.scopes.PerFragment;

/**
 * Created by yuyidong on 15/11/22.
 */
@Module public class FragmentModule {
  private Fragment mFragment;

  public FragmentModule(Fragment fragment) {
    mFragment = fragment;
  }

  @Provides @PerFragment @ContextLife("Activity") public Context provideContext() {
    return mFragment.getActivity();
  }

  @Provides @PerFragment public Activity provideActivity() {
    return mFragment.getActivity();
  }

  @Provides @PerFragment public Fragment provideFragment() {
    return mFragment;
  }
}
