@java.lang.Override
public void onSuccess(org.json.JSONObject jsonObject) {
    profileAvatar.setImageBitmap(bitmap);
    com.yueyang.travel.domin.Utils.SnackbarUtils.getSnackbar(pager, getString(R.string.avatar_update_success));
    blur();
}