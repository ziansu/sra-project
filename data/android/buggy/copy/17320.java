public void onPrestageActivityDestroy() {
    if ((org.catrobat.catroid.drone.DroneInitializer.droneControlService) != null) {
        prestageStageActivity.unbindService(this.droneServiceConnection);
    }
}