public void onclickSolve(android.view.View view) {
    if ((its.farkel.MainFarkel.hand.held) != 6) {
        return ;
    }
    its.farkel.MainFarkel.hand = its.farkel.MainFarkel.hand.bestHand();
    redisplay();
}