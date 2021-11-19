public void removeServerDatareceivedListener(wetsch.wirelessbarcodescannerserver.BarcodeServerDataListener listener) {
    listeners.remove(listener);
    if ((listeners.size()) == 0)
        listeners = null;
    
}