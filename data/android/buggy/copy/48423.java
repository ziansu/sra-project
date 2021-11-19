public static com.patrickcorriganjr.boardgameapp.UI.GameListFragment newInstance(int sectionNumber) {
    com.patrickcorriganjr.boardgameapp.UI.GameListFragment fragment = new com.patrickcorriganjr.boardgameapp.UI.GameListFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(com.patrickcorriganjr.boardgameapp.UI.GameListFragment.ARG_SECTION_NUMBER, sectionNumber);
    fragment.setArguments(args);
    return fragment;
}