public de.mt.poltool.model.Match fetchMatchFromMatchSite(java.lang.String sourceUrl) throws java.lang.Exception {
    de.mt.poltool.model.Match match = new de.mt.poltool.model.Match();
    org.jsoup.nodes.Document doc = getDocument(sourceUrl);
    fetchTeamNames(match, doc);
    match.addSets(parseRows(doc));
    return match;
}