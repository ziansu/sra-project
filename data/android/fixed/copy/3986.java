public java.util.List<lib.orianna.type.match.MatchSummary> getMatchHistory(final lib.orianna.api.RiotAPI API, final java.util.List<lib.orianna.type.staticdata.Champion> champions, final java.util.List<lib.orianna.type.match.QueueType> rankedQueues) {
    return getMatchHistory(API, champions, rankedQueues, null, null);
}