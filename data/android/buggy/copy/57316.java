public void destroy() {
    NavigationApplication.instance.getEventEmitter().sendScreenChangedEvent("didDisappear", params.navigationParams.navigatorEventId);
    dismiss();
}