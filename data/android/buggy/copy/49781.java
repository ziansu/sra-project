@java.lang.Override
public void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    super.onViewRecycled(holder);
    lifecycleSubject.onNext(null);
}