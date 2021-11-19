@java.lang.Override
protected com.ekreutz.barcodescanner.ui.BarcodeScannerView createViewInstance(com.facebook.react.uimanager.ThemedReactContext reactContext) {
    mBarcodeScannerView = new com.ekreutz.barcodescanner.ui.BarcodeScannerView(reactContext);
    return mBarcodeScannerView;
}