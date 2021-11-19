@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    adapter.getFilter().filter(s);
}