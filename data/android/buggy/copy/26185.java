private void doRequest() {
    _lastRequest = _get.request();
    synchronized(_parserLock) {
        _inpeParser = new xml.INPEXMLParser(_lastRequest);
    }
}