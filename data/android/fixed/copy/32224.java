@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    com.bruyu.imagewalker.ImageManager.cancelAll();
    com.bruyu.imagewalker.ImageManager.cleanHouse();
}