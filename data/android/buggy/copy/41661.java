@java.lang.Override
public com.takescoop.americanwhitewaterandroid.controller.BackEventResult onBack() {
    com.takescoop.americanwhitewaterandroid.controller.BackEventResult result = super.onBack();
    if (result == (BackEventResult.NotHandled)) {
        parentListener.onClose(filterContainer.getFilter());
    }
    return BackEventResult.Handled;
}