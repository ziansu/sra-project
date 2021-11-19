public static void updateFlagCount(int flags) {
    java.text.DecimalFormat flagFormat = new java.text.DecimalFormat("000");
    Game.flagCount.setText(flagFormat.format(flags));
}