@java.lang.Override
public void onPause() {
    super.onPause();
    ((T) (this)).doOnPause();
}