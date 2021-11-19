@java.lang.Override
public void onResume() {
    super.onResume();
    initViews(0);
    outputDirPresenterImple.queryFacesetDir(dirUrl, "getdir", "null", "output", new com.simoncherry.averagefaceclient.View.OutputDirFragment.MyStringCallBack(291, "null"));
}