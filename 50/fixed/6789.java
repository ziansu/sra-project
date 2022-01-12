private java.lang.String formatSeconds() {
    if ((mTime.second) < 10) {
        return "0" + (java.lang.Integer.toString(mTime.second));
    }
    return java.lang.Integer.toString(mTime.second);
}