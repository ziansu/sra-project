@java.lang.Override
public void onCreate() {
    super.onCreate();
    if ((roy.myclear.App.instance) == null) {
        roy.myclear.App.instance = this;
    }
}