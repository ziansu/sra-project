@java.lang.Override
public void getSelectedAppPackage(java.lang.String packageName) {
    this.packageName = packageName;
    showWidgetInformation();
    com.shivam.invisiblewidgetspro.utils.SharedPrefHelper.setPackageNameForWidgetId(this, widgetId, this.packageName);
    updateWidget();
}