public android.widget.TextView addSubItem(int id, @android.support.annotation.StringRes
int textId) {
    return addSubItem(id, getContext().getText(textId), null);
}