public void onClick(android.view.View v) {
    playerStrawSelected = true;
    coinCycle = genRand(2);
    dialog.dismiss();
    spinCoin();
}