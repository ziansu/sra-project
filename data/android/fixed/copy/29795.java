@java.lang.Override
protected void onResume() {
    super.onResume();
    newsDetailSupplier.setKey(newsDetail);
    repository.addUpdatable(this);
}