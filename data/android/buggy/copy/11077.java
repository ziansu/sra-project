@java.lang.Override
protected void onResume() {
    super.onResume();
    adapter.getFilter().filter("");
}