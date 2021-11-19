public void winUitkomst() {
    if (!(beurten)) {
        gewonnen();
        einde = true;
    }else {
        verloren();
        einde = true;
    }
}