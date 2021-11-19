private static void updateTriggerIndicator(android.view.View trigger) {
    if ((com.ceco.lollipop.gravitybox.ModPieControls.mCenterTrigger) && (com.ceco.lollipop.gravitybox.ModPieControls.mTrigindEnabled)) {
        trigger.setBackgroundColor(com.ceco.lollipop.gravitybox.ModPieControls.mTrigindColor);
    }else {
        trigger.setBackgroundColor(0);
    }
}