@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.i("Long Press", "gesture detector");
    android.widget.Toast.makeText(getActivity(), "Long Press (gesture detector)", Toast.LENGTH_SHORT).show();
}