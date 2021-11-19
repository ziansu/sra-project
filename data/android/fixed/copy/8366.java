@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.bck_btn_id :
            {
                backButtonPressed();
                break;
            }
        case R.id.home_btn_id :
            {
                homeButtonPressed();
                break;
            }
        case R.id.fwd_btn_id :
            {
                forwardButtonPressed();
            }
    }
}