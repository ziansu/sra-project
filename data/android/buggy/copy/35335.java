@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.d("on destory", "timetable");
    if ((courseRW) != null)
        courseRW.close();
    
}