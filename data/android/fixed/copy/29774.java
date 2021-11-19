private void checkIsInEditMode() {
    final android.os.Bundle arguments = getArguments();
    if (arguments == null) {
        edit = false;
    }else {
        edit = arguments.getBoolean(com.google.samples.apps.topeka.fragment.SignInFragment.ARG_EDIT, false);
    }
}