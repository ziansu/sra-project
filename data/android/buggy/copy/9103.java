public void withMaxResultSize(@android.support.annotation.IntRange(from = 100)
int width, @android.support.annotation.IntRange(from = 100)
int height) {
    mOptionBundle.putBoolean(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_SET, true);
    mOptionBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_X, width);
    mOptionBundle.putInt(com.yalantis.ucrop.UCrop.EXTRA_MAX_SIZE_Y, height);
}