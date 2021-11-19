@java.lang.Override
protected void mountFlatGUI() {
    if (promoteToView(true)) {
        if ((getHostView()) != null) {
            getHostView().mountFlatGUI(widgets);
        }
    }else {
        mWidgetGroup.replaceAll(widgets);
    }
}