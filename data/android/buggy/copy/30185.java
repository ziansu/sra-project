@java.lang.Override
public void onClick(android.view.View v) {
    super.onClick(v);
    switch (v.getId()) {
        case R.id.index_user :
            startActivity(new android.content.Intent(mContext, com.zzn.aeassistant.activity.user.UserActivity.class));
            break;
    }
}