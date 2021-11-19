public void setSwitchWithoutTriggering(android.support.v7.widget.SwitchCompat switchCompat, boolean newState) {
    switchCompat.setOnCheckedChangeListener(null);
    switchCompat.setChecked(newState);
    switchCompat.setOnCheckedChangeListener(this);
}