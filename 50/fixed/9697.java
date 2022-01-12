public void stopLoading() {
    progress.dismiss();
    progress = null;
    org.wildstang.wildrank.android.data.DataManager.prepareForEject();
}