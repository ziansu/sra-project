private void initLoader(android.os.Bundle bundle) {
    onStartLoading();
    au.com.pactera.pacterapulse.core.BaseFragment.getLoaderManager().initLoader(this.hashCode(), bundle, this);
}