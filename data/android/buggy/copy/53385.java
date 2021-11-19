private void initButtonRow() {
    mColor = getResources().getIntArray(R.array.pickerColors)[0];
    btnVibrate = ((android.widget.ToggleButton) (findViewById(R.id.btnToggleVibration)));
    btnColor = ((android.widget.ImageButton) (findViewById(R.id.btnPickColor)));
}