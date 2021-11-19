public double getRegressVers() {
    double RegressVersicherung = (getCurrent().isVersRegressversimausl()) ? -1 : 0;
    return RegressVersicherung;
}