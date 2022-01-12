public static void notifyChanged() {
    try {
        for (pom.poly.com.tabatatimer.Utility.Observer observer : pom.poly.com.tabatatimer.ContentProvider.Eventinf.observers) {
            observer.update();
        }
    } catch (java.lang.Exception exp) {
        android.util.Log.d("Eventinf.notifyChanged", exp.toString());
    }
}