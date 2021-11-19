private void destroyJsIfNeeded() {
    if (((com.reactnativenavigation.controllers.NavigationActivity.currentActivity) == null) || (com.reactnativenavigation.controllers.NavigationActivity.currentActivity.isFinishing())) {
        getReactGateway().onDestroyApp(this);
    }
}