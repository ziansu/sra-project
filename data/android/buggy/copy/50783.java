@java.lang.Override
public void onPageSelected(int position) {
    android.util.Log.d("myLogs", ("onPageSelected " + position));
    setCurrentPosition(position);
}