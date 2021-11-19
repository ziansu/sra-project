@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.apkfuns.logutils.LogUtils.getLogConfig().configAllowLog(true).configTagPrefix("LogUtilsDemo").configFormatTag("%d{HH:mm:ss:SSS} %t %c{-5}").configShowBorders(false).configLevel(LogLevel.TYPE_VERBOSE).addParserClass(com.apkfuns.logutils.demo.parse.OkHttpResponseParse.class);
}