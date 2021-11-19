@java.lang.Override
public void doNfcInBackground() throws java.io.IOException {
    updateNFCData(mWizardFragmentListener.nfcGetFingerprints(), mWizardFragmentListener.nfcGetAid(), mWizardFragmentListener.nfcGetUserId(), false);
}