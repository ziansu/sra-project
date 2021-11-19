@java.lang.Override
public void run() {
    items.remove(i);
    notifyDataSetChanged();
    updateNumPredictions();
}