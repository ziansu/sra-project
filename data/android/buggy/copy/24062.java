@java.lang.Override
public void onClick(android.view.View v) {
    final android.content.Context context = v.getContext();
    makeQuickAction(context, v, indexInItineraryList, position, mDataset.get(position));
}