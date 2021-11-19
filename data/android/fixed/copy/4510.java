public void gameEnd() {
    isPlay = false;
    parent.calMoney(accumulateMoney);
    accumulateMoney = 0;
    ctrlBtn.setImage(1);
}