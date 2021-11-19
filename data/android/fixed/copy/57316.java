public void destroy() {
    dismiss();
    NavigationApplication.instance.getEventEmitter().sendScreenChangedEvent("didDisappear", params.navigationParams.navigatorEventId);
}