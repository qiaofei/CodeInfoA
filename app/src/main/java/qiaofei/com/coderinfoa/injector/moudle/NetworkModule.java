package qiaofei.com.coderinfoa.injector.moudle;

import android.support.annotation.NonNull;
import android.support.v7.appcompat.BuildConfig;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import qiaofei.com.coderinfoa.utils.network.CommonUrl;
import qiaofei.com.coderinfoa.utils.network.NetworkApi;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import static okhttp3.logging.HttpLoggingInterceptor.Level.BODY;
import static okhttp3.logging.HttpLoggingInterceptor.Level.NONE;

/**
 * Created by QiaoFei on 2016/6/7.
 */
@Module public class NetworkModule {
  @Provides @NonNull @Singleton public OkHttpClient provideOkHttpClient() {

    OkHttpClient okHttpClient = new OkHttpClient();

    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
    httpLoggingInterceptor.setLevel(BuildConfig.DEBUG ? BODY : NONE);

    OkHttpClient newClient = okHttpClient.newBuilder()
        .connectTimeout(10, TimeUnit.SECONDS)
        .addInterceptor(httpLoggingInterceptor)
        .build();
    return newClient;
  }

  @Provides @Singleton public NetworkApi provideNetworkApi(OkHttpClient client) {

    Retrofit ApiAdapter = new Retrofit.Builder().baseUrl(CommonUrl.BASESERVICEURL)
        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build();
    return ApiAdapter.create(NetworkApi.class);
  }
}
