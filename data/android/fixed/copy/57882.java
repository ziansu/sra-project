public static void updateFlagCount(int flags) {
    if ((Game.flagCount) == null) {
        return ;
    }
    java.text.DecimalFormat flagFormat = new java.text.DecimalFormat("000");
    Game.flagCount.setText(flagFormat.format(flags));
}