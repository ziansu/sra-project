@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (wtfBool) {
        displayTrickWinnerPopUp();
        removeCardFromView(i);
        wtfBool = false;
    }
}