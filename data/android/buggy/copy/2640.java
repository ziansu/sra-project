private void addQRtoList(java.lang.String input) {
    if ((soft.swenggroup5.DecoderUtils.getQRCodeIndex(input)) == (CURRENT_INDEX)) {
        (CURRENT_INDEX)++;
        scannedStrings.add(input);
    }
}