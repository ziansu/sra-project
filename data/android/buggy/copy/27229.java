@java.lang.Override
public void onClick(android.view.View v) {
    mContext.startActivity(new android.content.Intent(mContext, com.easemob.qixin.activity.PersonalInfoActivity.class).putExtra("userId", item));
}