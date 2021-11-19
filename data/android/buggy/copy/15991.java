@java.lang.Override
public boolean isFinished() {
    try {
        return (inputStream.available()) < 0;
    } catch (java.io.IOException e) {
        return true;
    }
}