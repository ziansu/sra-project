@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.assistant_check :
            {
                checkAccount.setEnabled(false);
                accountCreator.isAccountActivated();
                break;
            }
    }
}