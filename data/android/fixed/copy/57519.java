@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i1, int i2) {
    if ((charSequence.length()) != 0) {
        sendButton.setImageResource(R.mipmap.input_send);
    }else {
        sendButton.setImageResource(R.drawable.ic_mic);
    }
}