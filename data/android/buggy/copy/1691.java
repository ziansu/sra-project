public static boolean sniffFragmented(com.google.android.exoplayer.extractor.ExtractorInput input) throws java.io.IOException, java.lang.InterruptedException {
    return com.google.android.exoplayer.extractor.mp4.Sniffer.sniffInternal(input, (4 * 1024), true);
}