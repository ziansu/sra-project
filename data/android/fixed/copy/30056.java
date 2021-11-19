public static void cut(java.lang.String inFile, java.lang.String outFile, double start, double end) throws java.io.IOException {
    new li.tf.mp3cutter.Mp3Cutter(inFile).cutTo(start, end, outFile);
}