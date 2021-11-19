@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mTeleField.isShown())) {
        mTeleField.setVisibility(View.VISIBLE);
    }else {
        mTeleField.setVisibility(View.GONE);
    }
}