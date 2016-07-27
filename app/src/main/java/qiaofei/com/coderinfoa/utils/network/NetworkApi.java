package qiaofei.com.coderinfoa.utils.network;

import dagger.Module;
import java.util.Map;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by QiaoFei on 2016/6/7.
 */
@Module public interface NetworkApi {
  /**
   * 检测服务器状况
   */
  @GET(CommonUrl.DISCLAIMERURL + "?type=1000000") Observable<TransMsgString> getDisclaimer();

  /**
   * 登陆注册
   */

  @GET(CommonUrl.LOGINURL) Observable<TransMsgString> login(@QueryMap Map<String, String> options);

  @FormUrlEncoded @POST(CommonUrl.REGISITERURL) Observable<TransMsgString> register(
      @FieldMap Map<String, String> options);

  @GET(CommonUrl.CHECKLOGINURL) Observable<TransMsgString> checkLogin(
      @QueryMap Map<String, String> options);

  /**
   * 司机
   */

  /**
   * 获取司机当前状态
   */
  @GET(CommonUrl.GETDRIVERSTATUSOURL) Observable<TransMsgBean> getDriverStatus(
      @Query("driverId") String userId);

  @POST(CommonUrl.CHANGESTATUSURL) Observable<TransMsgString> changeDriverStatus(
      @QueryMap Map<String, String> options);

  /**
   * 获取司机个人信息
   */
  @GET(CommonUrl.GETDRIVERINFO) Observable<TransMsgBean> getDriverInfo(
      @Query("driverId") String userId);

  @GET(CommonUrl.INDEXDISCLAIMERURL) Observable<TransMsgString> getNotice(
      @Query("type") String type);

  /**
   * driver状态与订单状态
   */
  @GET(CommonUrl.CHANGEORDERSTATUSURL) Observable<TransMsgString> changeOrderStatus(
      @QueryMap Map<String, String> options);

  @GET(CommonUrl.ORDERINFOURL) Observable<TransMsgBean> getOrderInfo(
      @Query("orderId") String orderId);

  //历史订单
  @GET(CommonUrl.GETORDERHISTORY) Observable<TransMsgArray> getOrderHisory(
      @QueryMap Map<String, String> options);

  //用户消息
  @GET(CommonUrl.GETMESSAGEBYUSERURL) Observable<TransMsgArray> getDriverMessage(
      @Query("driverId") String driverId);

  /**
   * 上传坐标
   */
  @FormUrlEncoded @POST(CommonUrl.UPDATEDRIVERCSYSURL) Observable<TransMsgString> updateDriverCsy(
      @FieldMap Map<String, String> options);
}
