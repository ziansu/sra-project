private org.cojen.tupl.CursorFrame lockLastFrame(org.cojen.tupl.CursorFrame lock) {
    while (true) {
        org.cojen.tupl.CursorFrame f = mLastCursorFrame;
        if ((f.tryLock(lock)) == f) {
            return f;
        }
    } 
}