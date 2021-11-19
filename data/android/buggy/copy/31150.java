public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        monumentList.setVisibility(View.VISIBLE);
    }else {
        monumentList.setVisibility(View.INVISIBLE);
    }
}