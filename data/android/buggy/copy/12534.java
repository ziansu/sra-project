protected void endElementRegion() {
    if (isInsideParagraph) {
        if (!(paragraphHasSentence)) {
            sentenceBegin = paragraphBegin;
            endElementS();
        }
        makeParagraph();
        captureText = false;
    }
}