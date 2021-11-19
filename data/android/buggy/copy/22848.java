@pub.devrel.easypermissions.AfterPermissionGranted(value = com.backyardbrains.BackyardBrainsMain.BYB_RECORD_AUDIO_PERM)
private void startAudioService() {
    if (pub.devrel.easypermissions.EasyPermissions.hasPermissions(this, Manifest.permission.RECORD_AUDIO)) {
        startAnalysisManager();
        startService();
    }else {
        pub.devrel.easypermissions.EasyPermissions.requestPermissions(this, getString(R.string.rationale_record_audio), com.backyardbrains.BackyardBrainsMain.BYB_RECORD_AUDIO_PERM, Manifest.permission.RECORD_AUDIO);
    }
}