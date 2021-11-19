private static int parseQuantity(java.lang.String text) {
    try {
        return org.jebtk.core.text.TextUtils.parseInt(text);
    } catch (java.text.ParseException e) {
        return 0;
    }
}