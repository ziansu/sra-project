@java.lang.Override
public void onClick(android.view.View v) {
    b = null;
    stopListenerOptions();
    stopListener();
    getValues();
    checkHorizontal();
    checkVertical();
    checkBox();
    startListenerOptions();
    startListener();
}