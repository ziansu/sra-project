public static boolean decoderIsWhitelistedForHevc(java.lang.String decoderName) {
    if (Build.DEVICE.equalsIgnoreCase("shieldtablet")) {
        return false;
    }
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.LOLLIPOP)) {
        return false;
    }
    return com.limelight.binding.video.MediaCodecHelper.isDecoderInList(com.limelight.binding.video.MediaCodecHelper.whitelistedHevcDecoders, decoderName);
}