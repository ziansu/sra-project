@java.lang.Override
public final boolean scrollToStart() {
    final boolean result = super.scrollToStart();
    if (result) {
        saveReadPosition();
    }
    return result;
}