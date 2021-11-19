@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        bottomNavigationViewFixed.setVisibility(View.INVISIBLE);
        bottomNavigationViewShifting.setVisibility(View.VISIBLE);
        bottomNavigationViewShifting.setTranslucentNavigationBar(me.timbals.materialdesigncomponents.BotttomNavigationActivity.hasNavBar(getWindowManager()));
    }
}