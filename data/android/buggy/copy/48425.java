@java.lang.Override
protected void onPostExecute(upv.ejercicios.proyectofinal.quierosermillonario.model.taskParams.HighScoresTableParams highScoresTableParams) {
    super.onPostExecute(highScoresTableParams);
    android.widget.TableLayout highScoresTable;
    highScoresTable = ((android.widget.TableLayout) (findViewById(R.id.user_high_scores_table_view)));
    displayInTable(highScoresTable, highScoresTableParams.getGameScoreList());
}