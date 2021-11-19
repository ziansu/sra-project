@java.lang.Override
public void onClick(android.view.View view) {
    if ((currentBook) == 66) {
        currentBook = 1;
    }else {
        currentBook += 1;
    }
    updateRecycleView(currentBook);
}