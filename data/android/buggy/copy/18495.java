public void CalculateCritial(int TargetIndex, int PlayerIndex) {
    if ((playerList.get(PlayerIndex).dEight) == (playerList.get(TargetIndex).dSix)) {
        playerList.get(PlayerIndex).dTwenty *= 2;
    }
}