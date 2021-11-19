@java.lang.Override
public void detachFragment() {
    super.onDetach();
    mListener = null;
}