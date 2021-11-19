@butterknife.OnClick(value = R.id.tv_emergency)
void navigateEmergency() {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.zhour.zhoursecurity.activities.GuestAndStaffActivity.class);
    startActivity(intent);
}