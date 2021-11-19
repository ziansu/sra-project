@java.lang.Override
public void onClick(android.view.View view) {
    if ((mListener) != null) {
        mListener.onSearchItemClick(view, getLayoutPosition(), text.getText().toString());
    }
}