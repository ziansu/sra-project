@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mQqzoneBtn.setBackgroundResource((isChecked ? R.drawable.btn_share_qzone : R.drawable.btn_share_qzone_unselected));
}