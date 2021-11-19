protected void setupValueEntryBox(final int id) {
    final com.stcarlso.goece.ui.AbstractEntryBox<?> box = ((com.stcarlso.goece.ui.AbstractEntryBox<?>) (findViewById(id)));
    box.setOnCalculateListener(this);
    registerAdjustable(box);
}