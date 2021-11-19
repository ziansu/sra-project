@java.lang.Override
public void showImage() {
    java.lang.String media = mImage.getMedia().getM();
    mView.showImage(media.replace("_m.jpg", "_b.jpg"));
}