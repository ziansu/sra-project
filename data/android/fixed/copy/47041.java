@java.lang.Override
public void onBackPressed() {
    mpClicked.start();
    imgSleep.startAnimation(animationTimer);
    timer.cancel();
    if (!(dialogBack.isShowing()))
        dialogBack.show();
    
}