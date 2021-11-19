@java.lang.Override
public void onCreate() {
    super.onCreate();
    kaufland.com.snackbarlibrary.SnackbarManager.init(kaufland.com.snackbarlibrary.SnackbarConfiguration.configure(new kaufland.com.snackbarlibrary.SnackbarConfiguration.Builder().gravity(SnackbarConfiguration.Gravity.GRAVITY_TOP).type(SnackbarConfiguration.SnackbarType.SINGLE_SNACKBAR)));
}