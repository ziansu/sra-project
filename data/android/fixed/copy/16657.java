private void setState(com.flipboard.bottomsheet.BottomSheetLayout.State state) {
    if (state != (this.state)) {
        this.state = state;
        for (com.flipboard.bottomsheet.BottomSheetLayout.OnSheetStateChangeListener onSheetStateChangeListener : onSheetStateChangeListeners) {
            onSheetStateChangeListener.onSheetStateChanged(state);
        }
    }
}