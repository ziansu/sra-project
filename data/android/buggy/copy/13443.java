private void getBundle() {
    android.os.Bundle bundle = getIntent().getExtras();
    if (!(bundle.isEmpty())) {
        id = bundle.getInt("id");
    }
}