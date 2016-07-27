package qiaofei.com.coderinfoa.utils.network;

/**
 * Created by Administrator on 2015/9/1.
 */
public class CommonUrl {
  //base service url
  //    public static final String BASESERVICEURL = "http://192.168.1.189:8080/TrailerService/";
  public static final String BASESERVICEURL = "http://120.24.13.208:8080/TrailerService/";
  //public static final String BASESERVICEURL = "http://192.168.1.140:8080/TrailerService/";

  public static final String DISCLAIMERURL = "systemApp/getNotice";
  /*
  获取首页公告
  参数:type(赋值notice即可)
   */
  public static final String INDEXDISCLAIMERURL = "systemApp/getNoticeByTitle";
  /*
   *用户注册
   * 参数:companyName,carNo,userName,password,phoneNum,selectedServiceType
   */
  public static final String REGISITERURL = "driverApp/register";
  /*
  用户登陆
  参数:phoneNum,password,channelId
   */
  public static final String LOGINURL = "driverApp/login";
  public static final String CHECKLOGINURL = "driverApp/checkLogin";
  /*
  首页用户信息
  参数:driverId
   */
  public static final String GETDRIVERINFO = "driverApp/getDriverMainInfo";
  /**
   * 根据订单id获取订单信息
   * 参数:orderId
   */
  public static final String ORDERINFOURL = "orderApp/getOrderById";
  /**
   * 根据司机id获取司机当前状态
   * 参数:driverId
   */
  public static final String GETDRIVERSTATUSOURL = "driverApp/getStatusByDriver";
  /**
   * 更新司机坐标
   * 参数:csys,driver,area(分别是,用户的经纬坐标用逗号连接,司机id,以及当前位置信息的字符串)
   */
  public static final String UPDATEDRIVERCSYSURL = "driverApp/updateDriverCsys";
  /**
   * 更新订单状态
   * 参数:orderId,orderStatus,distance(分别是司机id,司机状态,救援距离)
   */
  public static final String CHANGEORDERSTATUSURL = "orderApp/changeOrderStatus";
  /**
   * 获取司机的消息
   * 参数:
   */
  public static final String GETMESSAGEBYUSERURL = "systemApp/getMsgShowByDriver";
  /**
   * 上传照片url
   * 参数:image,orderId
   */
  public static String UPLOADIMGURL = BASESERVICEURL + "upload/uploadOrderImg";
  /**
   * 提交订单数据
   * orderId,driverId,travelPay,allPaySum,receiptNum,chargeType
   */
  public static final String SUBMITORDERURL = "orderApp/submitOrder";
  /**
   * 切换司机当前状态
   * 参数:driverStatus,driverId
   */
  public static final String CHANGESTATUSURL = "driverApp/changeStatus";
  /**
   * 上传司机证件照
   * 参数:image,driverTel,certType
   */
  public static final String UPLOADLISENCEIMGURL = BASESERVICEURL + "upload/uploadCertImg";
  /**
   * 获取历史订单
   * 参数:driverId,page(curr,当天three,seven,month)
   */
  public static final String GETORDERHISTORY = "orderApp/getHisOrderByDriver";
  /**
   * 帮助信息
   */
  public static final String GETHELPURL = BASESERVICEURL + "system/getHelpForApp";
}
