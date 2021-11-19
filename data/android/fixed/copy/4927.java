@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    com.openthos.appstore.MainActivity.mHandler.sendMessage(com.openthos.appstore.MainActivity.mHandler.obtainMessage(Constants.SEARCH_FRAGMENT, editable.toString()));
}