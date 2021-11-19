@java.lang.Override
public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo outAttrs) {
    return new com.layer.atlas.utilities.views.EmptyDelEditText.EmptyDelInputConnection(super.onCreateInputConnection(outAttrs), true);
}