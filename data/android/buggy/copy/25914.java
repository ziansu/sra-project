@java.lang.Override
public void onBackPressed() {
    if (mScreenStack.isEmpty()) {
        com.reactnativenavigation.controllers.ModalController.getInstance().remove();
        super.onBackPressed();
    }else {
        mScreenStack.pop();
    }
}