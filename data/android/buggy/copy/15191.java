private java.lang.String getSampleType(java.lang.String SAK) {
    java.lang.String unknownTypeString = "Unknown type";
    android.util.Log.e(palarax.e_key_card.NFC_Tag_Tech.nfcATag.TAG, "getting sample");
    return palarax.e_key_card.NFC_Tag_Tech.SampleTagAttributes.lookup(SAK, unknownTypeString);
}