public int compare(com.optimaize.langdetect.DetectedLanguage a, com.optimaize.langdetect.DetectedLanguage b) {
    return (b.getProbability()) > (a.getProbability()) ? 1 : -1;
}