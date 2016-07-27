package qiaofei.com.coderinfoa.utils.network;

import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by QiaoFei on 2016/2/25.
 */
public class JsonUtil {

  /**
   * 将json字符串转换成对象
   */
  public static Object transJsonToObject(String jsonStr, Class cls) {
    return new Gson().fromJson(jsonStr, cls);
  }

  /**
   * 将json字符串转换为List
   */
  public static List transJsonToList(String jsonStr, Class cls) {
    return new Gson().fromJson(jsonStr, type(List.class, cls));
  }

  /**
   * 将list转换成json字符串
   *//*
  public static String transListToJson(List list) {
    JSONArray jsonArray = null;
    try {
      JsonConfig jsonConfig = new JsonConfig();
      jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
      jsonArray = JSONArray.fromObject(list, jsonConfig);
    } catch (Exception e) {
    }
    return jsonArray.toString();
  }

  /**
   * 将对象转换称json字符串
   */
  public static String transObjectToJson(Object object) {
    /*Gson gson = new Gson();
    gson.toJson(object);
    JSONObject json = null;
    try {
      JsonConfig jsonConfig = new JsonConfig();
      jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
      json = JSONObject.fromObject(object, jsonConfig);
    } catch (Exception e) {
    }
    return json.toString();*/
    return new Gson().toJson(object);
  }

  private static ParameterizedType type(final Class raw, final Type... args) {
    return new ParameterizedType() {
      public Type getRawType() {
        return raw;
      }

      public Type[] getActualTypeArguments() {
        return args;
      }

      public Type getOwnerType() {
        return null;
      }
    };
  }
}

