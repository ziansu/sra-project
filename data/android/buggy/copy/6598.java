public boolean isSupport() {
    return (isSupport) && (parameters.getSupportedFlashModes().contains(Camera.Parameters.FLASH_MODE_TORCH));
}