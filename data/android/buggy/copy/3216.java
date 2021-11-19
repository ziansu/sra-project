private void shiftingMagic(com.roughike.bottombar.BottomBarTab oldTab, com.roughike.bottombar.BottomBarTab newTab, boolean animate) {
    if (isShiftingMode()) {
        oldTab.updateWidth(inActiveShiftingItemWidth, animate);
        newTab.updateWidth(activeShiftingItemWidth, animate);
    }
}