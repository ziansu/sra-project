@java.lang.Override
public void run() {
    mRecyclerView.setAdapter(new com.policestrategies.calm_stop.citizen.beacon_detection.BeaconDetectionAdapter(this, scannedBeacons, new com.policestrategies.calm_stop.citizen.beacon_detection.BeaconDetectionAdapter.OnItemClickListener() {
        @java.lang.Override
        public void onItemClick(com.policestrategies.calm_stop.citizen.beacon_detection.BeaconObject item) {
            syncWithOfficer(item);
        }
    }));
    closeProgressDialog();
}