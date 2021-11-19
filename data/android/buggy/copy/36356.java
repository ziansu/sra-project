@java.lang.Override
public void run() {
    if ((items.size()) <= i)
        items.remove(i);
    
    notifyDataSetChanged();
    updateNumPredictions();
}