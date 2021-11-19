@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_yes :
            c.finish();
            break;
        case R.id.btn_no :
            dismiss();
            break;
        default :
            break;
    }
    dismiss();
}