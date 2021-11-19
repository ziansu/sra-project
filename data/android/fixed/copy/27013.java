@java.lang.Override
public boolean beginTransaction() {
    try {
        transaction = cn.edu.fudan.se.dac.FileUtil.copy(dataFile, tempFile);
        return transaction;
    } catch (java.lang.Exception e) {
        return false;
    }
}