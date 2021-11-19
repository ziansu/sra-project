@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends javafx.util.Duration> arg0, javafx.util.Duration arg1, javafx.util.Duration arg2) {
    setScan();
    updateTimeStamp(timeStamp, mediaPlayer.getCurrentTime());
}