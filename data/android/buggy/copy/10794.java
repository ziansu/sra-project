@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    me.dacol.marco.mancala.logging.Logger.v(me.dacol.marco.mancala.gameUI.board.BoardFragment.LOG_TAG, "CreateView");
    mBoardTextViewRepresentation = null;
    mStartingPlayerName = null;
    android.view.View rootView = inflater.inflate(R.layout.fragment_board, container, false);
    return rootView;
}