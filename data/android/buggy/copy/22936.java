@java.lang.Override
public void onSliderClick(com.daimajia.slider.library.SliderTypes.BaseSliderView slider) {
    android.widget.Toast.makeText(getContext(), ((slider.getBundle().get("extra")) + ""), Toast.LENGTH_SHORT).show();
}