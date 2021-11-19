@java.lang.Override
public void onDestroy() {
    android.util.Log.e(com.example.m.divis.FragmentData.TAG, ((com.example.m.divis.FragmentData.TAG) + "LifeCycle FragmentData onDestroy"));
    freeBitmapResource(imageCaptured);
    super.onDestroy();
}