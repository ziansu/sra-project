public void onClick(android.view.View v) {
    if ((features.backButtonCanClose) && (!(inAppWebView.canGoBack()))) {
        closeDialog();
    }else {
        goBack();
    }
}