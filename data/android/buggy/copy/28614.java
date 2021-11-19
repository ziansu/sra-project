@java.lang.Override
public void onClick(android.view.View view) {
    if ((context) instanceof internetofeveryone.ioe.Browser.BrowserView) {
        ((internetofeveryone.ioe.Browser.BrowserView) (context)).onClickDownloadFavorite(name);
    }else {
    }
}