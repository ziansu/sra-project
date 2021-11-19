public static boolean isDone() {
    if ((application.BlockThread.nextPos.y) >= (application.BlockThread.blocksWide)) {
        return true;
    }
    return false;
}