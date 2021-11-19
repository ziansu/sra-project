@java.lang.Override
public void onActivityPaused(android.app.Activity activity) {
    if ((self.getContext().equals(activity)) || (!((self.getContext()) instanceof android.app.Activity))) {
        self.onActivityPaused(activity);
    }
}