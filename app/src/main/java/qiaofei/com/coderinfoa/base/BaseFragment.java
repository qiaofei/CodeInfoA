package qiaofei.com.coderinfoa.base;

/**
 * Created by Administrator on 2015/9/23.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import qiaofei.com.coderinfoa.injector.component.DaggerFragmentComponent;
import qiaofei.com.coderinfoa.injector.component.FragmentComponent;
import qiaofei.com.coderinfoa.injector.moudle.FragmentModule;

public abstract class BaseFragment extends Fragment {
  protected FragmentComponent fragmentComponent;

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = null;
    super.onCreate(savedInstanceState);
    if (getLayoutId() != 0) {
      view = inflater.inflate(getLayoutId(), container, false);
      ButterKnife.bind(this, view);
    }
    fragmentComponent = DaggerFragmentComponent.builder()
        .appComponent(MyApp.mAppComponent)
        .fragmentModule(new FragmentModule(this))
        .build();
    initInjector();
    initData();
    return view;
  }

  public abstract void initInjector();

  protected int getLayoutId() {
    return 0;
  }

  public void initData() {
  }

  @Override public void onDestroy() {
    ButterKnife.unbind(this);
    super.onDestroy();
  }
}
