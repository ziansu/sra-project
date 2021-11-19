public void ChangeRadius(int progress) {
    android.content.Intent intent = new android.content.Intent();
    intent.setClass(this, com.example.xiaoyi.sleepinthetrain.MapsActivity.class);
    intent.putExtra("POINT_RADIUS_CHANGED", progress);
    startActivity(intent);
}