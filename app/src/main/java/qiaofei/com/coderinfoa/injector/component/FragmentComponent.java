package qiaofei.com.coderinfoa.injector.component;

import android.app.Activity;
import android.content.Context;
import dagger.Component;
import qiaofei.com.coderinfoa.injector.moudle.FragmentModule;
import qiaofei.com.coderinfoa.injector.scopes.ContextLife;
import qiaofei.com.coderinfoa.injector.scopes.PerFragment;

/**
 * Created by yuyidong on 15/11/22.
 */
@PerFragment @Component(modules = FragmentModule.class, dependencies = AppComponent.class)
public interface FragmentComponent {
  @ContextLife("Application") Context getContext();

  @ContextLife("Activity") Context getActivityContext();

  Activity getActivity();

  //void inject(IndexFragment indexFragment);
}
