private void runAlgorithm() {
    btnRunAlgo.setEnabled(false);
    writeNewPostToDB();
    compareTastes();
    java.util.Collections.sort(cTaste, new com.example.gad.themovie_180617.Model.UsersTasteComparator());
    fbIdArr = getFbIdStrArr();
    goToShowRecAlgoMovies();
}