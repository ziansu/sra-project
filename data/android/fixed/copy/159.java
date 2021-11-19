private void startProcessDialog() {
    try {
        pDialog.show();
    } catch (android.view.WindowManager e) {
        com.gmail.mkounal.places.Enviroment.Logging.log(Logging.enumLoggingLevel.e, TAG, "activity is not running");
    }
}