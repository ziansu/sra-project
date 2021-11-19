@java.lang.Override
protected void onStart() {
    super.onStart();
    bmobUser = cn.bmob.v3.BmobUser.getCurrentUser(edu.scau.buymesth.data.bean.User.class);
    if ((bmobUser) != null)
        queryUser();
    else {
        jumpToNextActivity();
    }
}