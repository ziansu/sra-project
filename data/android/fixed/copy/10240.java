private void updateStatus() {
    if ((count) <= 0) {
        status = MediaCounterStatus.NEW;
    }else {
        status = MediaCounterStatus.ONGOING;
    }
}