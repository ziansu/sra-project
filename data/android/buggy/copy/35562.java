@java.lang.Override
public void onBackPressed() {
    if ((counter) > 1) {
        storePlanogram();
        (counter)--;
        restorePlanogram(counter);
    }else {
        super.onBackPressed();
    }
}