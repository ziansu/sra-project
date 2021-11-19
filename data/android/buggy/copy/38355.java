@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String key = s.toString();
    android.util.Log.e("fujianguo", ("key = " + key));
    mSerachKey = key;
    initData();
}