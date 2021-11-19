private void setFlashlightOff() {
    params.setFlashMode(Parameters.FLASH_MODE_OFF);
    camera.setParameters(params);
    camera.stopPreview();
    isFlashlightOn = false;
    flashlightSwitchImg.setImageResource(R.drawable.light_off);
}