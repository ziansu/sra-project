@java.lang.Override
protected void onRestart() {
    super.onRestart();
    puzzleArray.clear();
    puzzleArray.addAll(myDBHandler.getAllPuzzles());
    adapter.notifyDataSetChanged();
}