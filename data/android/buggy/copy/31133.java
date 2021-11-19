@java.lang.Override
public boolean shouldHideFlash() {
    if (!(useStillshot())) {
        return true;
    }else {
        return (mFlashModes) == null;
    }
}