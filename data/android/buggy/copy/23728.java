@java.lang.Override
public void safeRun() {
    final com.dava.framework.JNITextField.TextField text = com.dava.framework.JNITextField.GetTextField(id);
    text.setTextSize(TypedValue.COMPLEX_UNIT_PX, ((int) (size)));
    text.updateStaticTexture();
}