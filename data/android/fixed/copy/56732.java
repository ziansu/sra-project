@java.lang.Override
public double[] getWhitePoint() {
    if ((colorSpace) instanceof org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace) {
        org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace cie = ((org.verapdf.features.pb.objects.PDCIEDictionaryBasedColorSpace) (colorSpace));
        return org.verapdf.features.pb.objects.PBColorSpaceFeaturesObjectAdapter.parseTristimulus(cie.getWhitepoint());
    }
    return null;
}