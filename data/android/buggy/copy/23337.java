@java.lang.Override
public void onClick(android.view.View v) {
    mListener.onSelect(res, position);
    int tmp = activePos;
    activePos = position;
    notifyItemChanged(tmp);
    notifyItemChanged(position);
}