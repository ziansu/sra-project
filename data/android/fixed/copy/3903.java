@java.lang.Override
public void onResume() {
    super.onResume();
    root.addValueEventListener(valueEventListener);
}