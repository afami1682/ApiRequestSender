package jp.morijyobi.apirequestsender.ftp;

/**
 * Created by h.takahashi on 2017/06/17.
 */

public class FTPConfig {
    public static String HOST = "";
    public static String REMOTE_DIR = "";
    public static String ENCODE_TYPE = "UTF-8";

    interface AUTH_USER {
        String NAME = "";
        String PASSWORD = "";
    }

    // FTP通信の間隔（連打防止）
    public static int REQUEST_INTERVAL = 500;
}
