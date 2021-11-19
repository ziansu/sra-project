@java.lang.Override
public void onCatalystInstanceDestroy() {
    super.onCatalystInstanceDestroy();
    cn.jpush.reactnativejpush.JPushModule.mModule = null;
}