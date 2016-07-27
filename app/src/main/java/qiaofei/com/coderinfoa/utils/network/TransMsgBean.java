package qiaofei.com.coderinfoa.utils.network;

import com.google.gson.JsonObject;

/**
 * Created by QiaoFei on 2016/6/13.
 */

public class TransMsgBean {

  /**
   * status : 1
   * transData : 1000000:c3ea88d0-79d1-4dd6-a781-be6f12427191
   * transName : String
   */

  private int status;
  private JsonObject transData;
  private String transName;

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public JsonObject getTransData() {
    return transData;
  }

  public void setTransData(JsonObject transData) {
    this.transData = transData;
  }

  public String getTransName() {
    return transName;
  }

  public void setTransName(String transName) {
    this.transName = transName;
  }
}
