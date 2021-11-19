@java.lang.Override
public void safeRun() {
    com.dava.framework.JNITextField.TextField text = com.dava.framework.JNITextField.GetTextField(id);
    text.setEnabled(value);
}