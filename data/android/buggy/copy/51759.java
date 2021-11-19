@java.lang.Override
public void onPause() {
    super.onPause();
    reli.reliapp.co.il.reli.main.HomeFragment.runningAll = false;
    reli.reliapp.co.il.reli.main.HomeFragment.runningMy = false;
}