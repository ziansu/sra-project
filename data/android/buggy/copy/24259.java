public static void putPageRank(java.lang.String u, java.lang.Double pr) {
    edu.upenn.cis455.storage.DBWrapperIndexer.pageRankIndex.put(new edu.upenn.cis455.storage.PageRank(u, pr));
}