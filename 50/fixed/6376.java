@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_getURL :
            get_address();
            break;
        case R.id.btn_analyze :
            getTextFromActivity();
            break;
        case R.id.btn_reset :
            resetText();
            break;
    }
}