@java.lang.Override
public void onClick(android.view.View v) {
    if ((cm.com.newdon.common.CommonData.bottomBarActivity) != null) {
        CommonData.bottomBarActivity.changePostDonationsFragment(post.getId());
    }
}