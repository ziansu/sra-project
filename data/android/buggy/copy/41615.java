@java.lang.Override
public void onClick(android.view.View v) {
    if (callBack != null)
        callBack.onReplay();
    
    dialog.dismiss();
}