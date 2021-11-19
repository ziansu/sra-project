@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("TAG", "Canceling adding of Student");
    if ((delegate) != null)
        delegate.onCancel();
    
}