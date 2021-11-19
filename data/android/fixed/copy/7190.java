@java.lang.Override
public void onClick(android.view.View v) {
    children.priorSels[groupPosition] = childPosition;
    notifyItemChanged(groupPosition);
}