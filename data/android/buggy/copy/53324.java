public void refreshMatrices() {
    ((de.oerntec.matledcontrol.DiscoveryFragment.DiscoveryAdapter) (mAvailableMatrices.getAdapter())).notifyDataSetChanged();
}