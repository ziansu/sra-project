private void increment() {
    if ((mListener) != null) {
        mListener.onRepeatUpdaterEvent(gemstone.gemster.RepeatUpdater.EventMode.EVENT_INCREMENT, null);
    }
}