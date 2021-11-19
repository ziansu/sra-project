@java.lang.Override
public void onPregress(float progress) {
    float PROGRESS = ((counts - (fetchedDatas.size())) / counts) + progress;
    _photosDownloadListener.onPregress(PROGRESS);
}