public void addAll(java.util.ArrayList<com.dozuki.ifixit.model.guide.GuideInfo> list) {
    android.util.Log.d("GuideCreateActivity", "addall");
    mGuides.addAll(list);
    notifyDataSetChanged();
}