@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.relLayout :
            android.content.Intent myCartIntent = new android.content.Intent(getApplicationContext(), com.cb.vmss.MyCartActivity.class);
            startActivityForResult(myCartIntent, Constant.CODE_MAIN_LOGIN);
            break;
    }
}