@java.lang.Override
public void onTransitionEnd(android.transition.Transition transition) {
    if (!(doNotShowAgain)) {
        dialog.show();
        doNotShowAgain = true;
    }
}