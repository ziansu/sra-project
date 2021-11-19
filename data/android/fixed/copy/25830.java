@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.example.yqhok.coolweather.application.MyApplication.context = getApplicationContext();
    org.litepal.LitePalApplication.initialize(com.example.yqhok.coolweather.application.MyApplication.context);
    com.avos.avoscloud.AVOSCloud.initialize(this, "ny1OrJPEwlsKYp8b4OlER0KR-gzGzoHsz", "o5SHIkdU2SOCMoxlhKLiQxmw");
}