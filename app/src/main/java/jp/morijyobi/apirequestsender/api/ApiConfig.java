package jp.morijyobi.apirequestsender.api;

/**
 * Created by h.takahashi on 2017/06/16.
 */

public class ApiConfig {
    public static String DOMAIN = "";
    // APIプロジェクト名
    public static String PROJECT_NAME = "";
    public static String BASE_URL = "http://" + DOMAIN + "/" + PROJECT_NAME;

    // API通信の間隔（連打防止）
    public static int REQUEST_INTERVAL = 500;
}
