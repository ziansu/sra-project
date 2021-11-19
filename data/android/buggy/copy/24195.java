@java.lang.Override
public void onFailure(java.lang.String msg) {
    showProgress(false);
    adapter.replaceWith(images);
    fetch(false);
}