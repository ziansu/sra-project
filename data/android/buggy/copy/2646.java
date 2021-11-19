@java.lang.Override
protected java.lang.Object calculate() {
    if ((libraryButton.getData(com.google.cloud.tools.eclipse.appengine.ui.AppEngineLibrariesSelectorGroup.BUTTON_MANUAL_SELECTION_KEY)) != null) {
        return true;
    }else {
        return super.calculate();
    }
}