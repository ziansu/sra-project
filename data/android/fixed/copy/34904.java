public void redirect(java.lang.String id) {
    android.content.Intent intent = new android.content.Intent(this, net.kodegeek.frontendioio.VisitorMainActivity.class);
    intent.putExtra("id", id);
    startActivity(intent);
}