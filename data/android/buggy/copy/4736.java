@java.lang.Override
public void onBackPressed() {
    mySound.release();
    mySound = null;
    this.finish();
    super.onBackPressed();
}