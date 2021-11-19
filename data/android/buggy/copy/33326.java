public void onClick(android.view.View v) {
    this.finish();
    android.content.Intent intent = new android.content.Intent(this, gr.hua.dit.smartt.MapsActivity.class);
    startActivity(intent);
}