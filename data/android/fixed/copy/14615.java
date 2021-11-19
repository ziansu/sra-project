@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mRackets = com.plew.android.simpleracketdb.RacketList.get(getActivity()).getRackets();
    setHasOptionsMenu(true);
}