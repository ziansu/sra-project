private void toggleTrading() {
    notate.remoteToggleImprovise();
    if (trading) {
        tradingStopped();
        trading = false;
    }else {
        tradingStarted();
        trading = true;
    }
}