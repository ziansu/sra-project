@java.lang.Override
public void run() {
    if ((mHandler) != null) {
        mHandler.removeCallbacks(mUpdateReceivedProg);
    }
    if ((edu.cmu.cylab.starslinger.exchange.ExchangeActivity.mProt) != null) {
        edu.cmu.cylab.starslinger.exchange.ExchangeActivity.mProt.endProtocol();
    }
}