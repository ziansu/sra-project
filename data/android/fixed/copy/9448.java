@java.lang.Override
public boolean isValid(java.lang.CharSequence value) {
    return (!(android.text.TextUtils.isEmpty(value))) && ((value.length()) >= (minLength));
}