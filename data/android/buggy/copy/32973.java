@java.lang.Override
public void onScrollingFinished(com.terrydr.pickerview.wheelview.WheelView wheel) {
    result = java.lang.String.valueOf(arrayWheelAdapter.getItemText(wheel.getCurrentItem()));
    android.util.Log.e(com.terrydr.pickerview.PickerView_Plugin_intent.TAG, ("scrollListenerResult:" + (result)));
}