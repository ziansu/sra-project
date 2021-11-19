@java.lang.Override
public void onPregress(float progress) {
    float PROGRESS = (counts - (fetchedDatas.size())) + (((1.0F / counts) * progress) / counts);
    _photosDownloadListener.onPregress(PROGRESS);
}