public void onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    if ((mParentDelegate) != null) {
        bundle = mParentDelegate.mBundle;
    }else {
    }
    onCreate(bundle);
}