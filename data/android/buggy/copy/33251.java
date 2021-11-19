public rx.Observable<? extends rx.Observable<com.alangpierce.lambdacalculusplayground.drag.PointerMotionEvent>> getBodyObservable() {
    autovalue.shaded.com.google.common.common.base.Preconditions.checkState(((bodyView) != null));
    return dragObservableGenerator.getDragObservable(bodyView.getNativeView());
}