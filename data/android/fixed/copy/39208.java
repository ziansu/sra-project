public boolean isValid() {
    synchronized(mSync) {
        return (!((mSurface) instanceof android.view.Surface)) || (((android.view.Surface) (mSurface)).isValid());
    }
}