@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    dismiss();
    long profileSqlId = id;
    eu.chessdata.services.TournamentService.startActionTournamentAddPlayer(getContext(), mTournamentSqlId, profileSqlId);
}