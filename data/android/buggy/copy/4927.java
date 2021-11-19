@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (!(android.text.TextUtils.isEmpty(editable.toString()))) {
        com.openthos.appstore.MainActivity.mHandler.sendMessage(com.openthos.appstore.MainActivity.mHandler.obtainMessage(Constants.SEARCH_FRAGMENT, editable.toString()));
    }
}