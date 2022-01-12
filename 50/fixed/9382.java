@java.lang.Override
public void onBackPressed() {
    finishAffinity();
    startActivity(new android.content.Intent(this, com.johnsimon.payback.ui.FeedActivity.class));
}