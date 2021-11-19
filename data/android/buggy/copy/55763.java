public void ResetEntry() {
    CurState = net.obry.ti5x.State.EntryState;
    if ((CurFormat) == (net.obry.ti5x.State.FORMAT_FIXED)) {
        CurDisplay = "0.";
        ExponentEntered = false;
    }else {
        CurDisplay = "0. 00";
        ExponentEntered = true;
    }
    SetShowing(CurDisplay);
}