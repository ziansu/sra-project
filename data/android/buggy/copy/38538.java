private static java.lang.String getStringByFirstWord(java.lang.String firstWord) {
    java.lang.String ret = com.nanosic.stringup.DBController.getInstance(com.nanosic.stringup.StringGenerator.context).find(firstWord);
    android.util.Log.d(com.nanosic.stringup.StringGenerator.TAG, ("getStringByFirstWord: ret=" + ret));
    return ret;
}