@java.lang.Override
public boolean start() {
    try {
        frame.sdk.fetion.kit.FetionKit.init(fromMobile, password);
    } catch (frame.sdk.fetion.FetionException e) {
        e.printStackTrace();
    }
    return true;
}