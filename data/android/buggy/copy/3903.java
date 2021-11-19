@java.lang.Override
public void onResume() {
    super.onResume();
    root.addListenerForSingleValueEvent(valueEventListener);
    root.addValueEventListener(valueEventListener);
}