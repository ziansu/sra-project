@java.lang.Override
public void onClick(android.view.View v) {
    for (int i = 0; i < (children.priorSels.length); i++) {
        children.priorSels[i] = -1;
    }
    children.priorSels[childPosition] = 1;
    notifyItemChanged(groupPosition);
}