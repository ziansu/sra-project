@java.lang.Override
public void onItemClickListener(android.view.View v, com.peter.parttime.managershare.ManagerShareActivity.Paper p) {
    com.peter.parttime.managershare.ManagerShareActivity.switchToArticle(this, p.mHref, p.mPicture, p.mTitle, v.findViewById(R.id.pic), v);
}