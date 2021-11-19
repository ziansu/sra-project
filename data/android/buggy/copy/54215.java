@java.lang.Override
public void onClick(android.view.View view) {
    if (null != fileName) {
        this.onPlayButtonClick(playButton, fileName);
    }else {
        this.onPlayButtonClick(playButton, mCurrent.getFilePath());
    }
}