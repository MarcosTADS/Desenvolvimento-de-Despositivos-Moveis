package com.example.tarefa1.api_interface;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.OkHttpClient;
import java.util.concurrent.TimeUnit;
public class RetrofitClient {
    private static Retrofit retrofit = null;
    private static final String BASE_URL = "http://127.0.0.1:8000/produtos_api";

    public static Retrofit getClient() {
        if (retrofit == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(logging)
                    .connectTimeout(30, TimeUnit.SECONDS) // Tempo limite de conexão
                    .readTimeout(30, TimeUnit.SECONDS)    // Tempo limite de leitura
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()) // Adiciona o conversor Gson
                    .client(client) // Adiciona o cliente OkHttp com o interceptor
                    .build();
        }
        return retrofit;
    }
    public static PostService getPostService() {
        return getClient().create(PostService.class);
    }


}
