private void startJob(int deviceId, int totalPages) {
    com.wildflower.sensei.service.MotherNodeService.DeviceDataJob job = new com.wildflower.sensei.service.MotherNodeService.DeviceDataJob(totalPages);
    deviceDataJobs.put(deviceId, job);
    publishProgress(deviceId, job);
}