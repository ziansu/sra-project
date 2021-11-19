@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.back_button :
            openDialog();
            break;
        case R.id.yesButton :
            goBack();
            break;
        default :
            break;
    }
}