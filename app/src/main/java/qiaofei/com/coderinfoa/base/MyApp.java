package qiaofei.com.coderinfoa.base;

import android.app.Application;
import java.io.IOException;
import qiaofei.com.coderinfoa.injector.component.AppComponent;
import qiaofei.com.coderinfoa.utils.cacheutils.ACache;
import qiaofei.com.coderinfoa.utils.cacheutils.DiskLruCacheHelper;

/**
 * Created by QiaoFei on 2016/6/6.
 */
//DaemonApplication
public class MyApp extends Application {
  public static ACache mCache;
  public static DiskLruCacheHelper diskLruCacheHelper;
  public static AppComponent mAppComponent;

  @Override public void onCreate() {
    super.onCreate();
    mCache = ACache.get(this);
    try {
      diskLruCacheHelper = new DiskLruCacheHelper(getApplicationContext());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

