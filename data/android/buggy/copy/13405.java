private void handleSetNavigationIcon(java.lang.Object object) {
    navigationIcon = object;
    org.appcelerator.titanium.view.TiDrawableReference tiDrawableReference = org.appcelerator.titanium.view.TiDrawableReference.fromObject(proxy.getActivity(), object);
    ((android.support.v7.widget.Toolbar) (getNativeView())).setNavigationIcon(tiDrawableReference.getDrawable());
}