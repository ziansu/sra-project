private void indexCandidateGeneList(com.gmi.nordborglab.browser.server.domain.util.CandidateGeneList candidateGeneList) {
    try {
        esIndexer.index(candidateGeneList);
    } catch (java.io.IOException e) {
        com.gmi.nordborglab.browser.server.service.impl.MetaAnalysisServiceImpl.logger.error("Failed to index candidate gene list", e);
    }
}