@java.lang.Override
public void run() {
    ninjaWebView.setAlbumCover(io.github.mthli.Ninja.Unit.ViewUnit.capture(ninjaWebView, dimen144dp, dimen108dp));
    updateRefresh(false);
    progressWrapper.setVisibility(View.GONE);
}