@java.lang.Override
public void onBackPressed() {
    if ((layoutPostmanMask.getVisibility()) == (android.view.View.VISIBLE)) {
        layoutPostmanMask.setVisibility(View.GONE);
        return ;
    }
    super.onBackPressed();
}