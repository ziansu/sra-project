@java.lang.Override
public void onActivityPaused(android.app.Activity activity) {
    if ((self.getContext().equals(activity)) || (self.getContext().equals(com.vilyever.contextholder.ContextHolder.getContext()))) {
        self.onActivityPaused(activity);
    }
}