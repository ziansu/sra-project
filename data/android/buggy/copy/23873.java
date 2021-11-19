@java.lang.Override
public void onClick(android.view.View view) {
    mWordCards.remove(position);
    notifyDataSetChanged();
}