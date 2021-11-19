private void OnCheckWinning(Hand hand) {
    Winning win = new Winning();
    win.SetHand(hand);
    winning = win.GetWinning();
}