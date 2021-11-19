@android.support.annotation.NonNull
@java.lang.Override
public android.app.Dialog onCreateDialog(android.os.Bundle savedInstanceState) {
    presenter.onCreateView();
    preCreateView();
    android.app.Dialog result = createDialog(savedInstanceState);
    postCreateView(result, savedInstanceState);
    return result;
}