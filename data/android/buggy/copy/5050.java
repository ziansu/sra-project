@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    saveInstanceStateForFields(outState, getInstance(), getInstance().getClass());
}