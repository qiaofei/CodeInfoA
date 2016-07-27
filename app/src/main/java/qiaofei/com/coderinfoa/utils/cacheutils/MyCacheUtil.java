package qiaofei.com.coderinfoa.utils.cacheutils;

import qiaofei.com.coderinfoa.base.MyApp;

/**
 * Created by QiaoFei on 2016/4/7.
 */
public class MyCacheUtil {
  public static DiskLruCacheHelper diskLruCacheHelper = MyApp.diskLruCacheHelper;

  /**
   * 首次打开app部分参数初始化
   */
  public static void initCache() {

  }

  /**
   * 清空缓存
   */
  public static void clearCache() {

  }

  /**
   * 使用示例
   */
  public static boolean notFirstLaunch() {
    return "true".equals(diskLruCacheHelper.getAsString("notFirstLaunch"));
  }

  public static void setNotFirstLaunch(String isFirstLaunch) {
    diskLruCacheHelper.put("notFirstLaunch", isFirstLaunch);
  }
}
