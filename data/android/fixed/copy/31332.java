@java.lang.Override
public void notifyDataSetChanged() {
    super.notifyDataSetChanged();
    for (android.database.DataSetObserver observer : observes) {
        observer.onChanged();
    }
}