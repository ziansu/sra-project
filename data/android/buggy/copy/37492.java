private org.opencv.core.Mat processMat(org.opencv.core.Mat src) {
    org.opencv.core.Mat[][] numbersCrop = getCroppedMats(src);
    com.maurice.app.sudokuapp.ImageParser.DigitRecogniser2 digitRecogniser2 = com.maurice.app.sudokuapp.ImageParser.DigitRecogniser2.getInstance(mContext);
    digitRecogniser2.recogniseDigits(numbersCrop);
    return numbersCrop[0][2];
}