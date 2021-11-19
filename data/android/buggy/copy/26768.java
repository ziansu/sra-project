private void startNetwork() {
    com.coderedrobotics.dashboard.communications.Connection.getInstance().unlock();
    com.coderedrobotics.dashboard.dashboard.Start.isLoading = false;
}