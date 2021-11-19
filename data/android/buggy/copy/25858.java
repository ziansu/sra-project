void PrintWrite(int type) {
    CalcCheckSum();
    try {
        mPrintWriter.write(dataPackage);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}