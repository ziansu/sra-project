@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    topic = topicS.getText().toString();
    android.util.Log.e("Topic", topic);
}