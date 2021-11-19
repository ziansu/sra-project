public static java.lang.String getAllContent(java.lang.String content) {
    java.lang.String result = android.jiang.com.library.utils.HttpUtils.getXSSContent(content);
    return android.jiang.com.library.utils.HttpUtils.getContent(false, result);
}