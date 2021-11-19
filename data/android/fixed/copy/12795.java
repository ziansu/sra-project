@java.lang.Override
public void onLoad() {
    super.onLoad();
    if (null == (_tapRecognizer)) {
        _tapRecognizer = new com.gwtmobile.ui.client.event.TapRecognizer(this, 40);
    }
}