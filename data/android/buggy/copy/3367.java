@java.lang.Override
protected void onPositiveClick() {
    sLogger.userInteraction("Clicked OK");
    mViewModel.onClickedOK();
}