@java.lang.Override
protected void onDestroy() {
    gruppe3.convoy.GMapsFragment.gMap = null;
    gruppe3.convoy.GMapsFragment.poly = null;
    gruppe3.convoy.GMapsFragment.polyLineOptions = null;
    super.onDestroy();
}