@java.lang.Override
public void onDetach() {
    super.onDetach();
    initialized = false;
    destroy(getElement());
}