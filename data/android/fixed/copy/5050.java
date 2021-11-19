@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    saveInstanceStateForFields(outState, getInstance(), getInstance().getClass());
    super.onSaveInstanceState(outState);
}