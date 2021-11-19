public boolean analyze() throws java.io.IOException, java.net.URISyntaxException {
    boolean success = false;
    int faceNum = Utils.FaceRec.getFaceNum(imageURL);
    Utils.FaceRec.faceAnalyze(imageURL, false);
    java.lang.System.out.println(faceNum);
    success = true;
    return success;
}