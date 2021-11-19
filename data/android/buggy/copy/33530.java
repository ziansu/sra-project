@java.lang.Override
public void handleMessage(android.os.Message msg) {
    com.example.sunshinewatch.MyWatchFace.Engine engine = mWeakReference.get();
    if (engine != null) {
        switch (msg.what) {
            case com.example.sunshinewatch.MyWatchFace.MSG_UPDATE_TIME :
                engine.handleUpdateTimeMessage();
                break;
        }
    }
}