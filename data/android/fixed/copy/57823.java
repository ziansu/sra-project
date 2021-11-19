public android.content.Intent getIntent() {
    if ((intentOpenAntivirus) == null) {
        return isPlayStoreAvailable() ? intentGetAntivirus : null;
    }else {
        return intentOpenAntivirus;
    }
}