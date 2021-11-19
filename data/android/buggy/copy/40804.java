@java.lang.Override
public boolean stop() {
    if ((frame.sdk.fetion.kit.FetionKit.getFetionConsole()) != null) {
        try {
            frame.sdk.fetion.kit.FetionKit.getFetionConsole().close();
        } catch (frame.sdk.fetion.FetionException e) {
            e.printStackTrace();
        }
    }
    return true;
}