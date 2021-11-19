@android.support.annotation.NonNull
private static java.io.File getStartPageFile(@android.support.annotation.NonNull
android.app.Application application) {
    return new java.io.File(application.getFilesDir(), acr.browser.lightning.constant.StartPage.FILENAME);
}