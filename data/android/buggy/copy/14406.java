@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    if (wtfBool) {
        displayTrickWinnerPopUp();
        resetPlayedCards();
        removeCardFromView(i);
        com.companyname.hearts.model.Table.getInstance().getBoard().clear();
        activateListeners();
        wtfBool = false;
    }
}