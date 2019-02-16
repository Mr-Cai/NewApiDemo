package com.dev.news.Common;

import com.dev.news.Interface.IconBetterIdeaService;
import com.dev.news.Interface.NewsService;
import com.dev.news.Remote.IconBetterIdeaClient;
import com.dev.news.Remote.RetrofitClient;

/**
 * Created by reale on 10/4/2017.
 */

public class Common {
    private static final String BASE_URL = "https://newsapi.org/";

    public static final String API_KEY = "b806459b4e684364bd79a792b8f02abc";

    public static NewsService getNewsService() {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService() {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    //https://newsapi.org/v1/articles?source=the-next-web&sortBy=latest&apiKey=a7072d9c2ad9495a8dd5cb58a7fd30df
    public static String getAPIUrl(String source, String sortBy, String apiKEY) {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }


}
