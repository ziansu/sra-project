@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... params) {
    parser.fetchJSON(getContext(), getTeamFromSettings);
    while (parser.parsingComplete);
    teamEventMatches.clear();
    teamEventMatches.addAll(parser.getTeamEventMatches());
    return null;
}