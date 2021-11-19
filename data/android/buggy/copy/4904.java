@java.lang.Override
public void onClick(android.view.View v) {
    showMovieTasteTest();
    if ((movieList.size()) > 0) {
        movieList.remove(0);
    }
}