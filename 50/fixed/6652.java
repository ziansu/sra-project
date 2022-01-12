protected com.samsung.memoryanalysis.staleness.StreamingStalenessAnalysis.LastUseUnreachableInfo updateMostRecentUse(int objectId, long time, com.samsung.memoryanalysis.traceparser.SourceMap.SourceLocId slId) {
    com.samsung.memoryanalysis.staleness.StreamingStalenessAnalysis.LastUseUnreachableInfo lastUseUnreachableInfo = getLastUseUnreachableInfo(objectId);
    if ((lastUseUnreachableInfo.mostRecentUseTime) < time) {
        lastUseUnreachableInfo.mostRecentUseTime = time;
        lastUseUnreachableInfo.mostRecentUseSite = slId;
    }
    return lastUseUnreachableInfo;
}