@java.lang.Override
public void setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy configuration) {
    portText.setText(("" + 1099));
    portID = portText.getText();
}