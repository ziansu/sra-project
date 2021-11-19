@java.lang.Override
public void onResume(boolean multitasking) {
    eidReader.resume();
    super.onResume(multitasking);
}