@java.lang.Override
public void onDestroy() {
    adapter.viewHashMap = null;
    adapter = null;
    if ((galleryViewPager) != null)
        galleryViewPager.setAdapter(null);
    
    super.onDestroy();
}