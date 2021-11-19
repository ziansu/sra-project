public ch.bfh.projekt1.psyloginanalyzer.config.StaticAnalyseConfig getConfig() {
    javax.persistence.TypedQuery<ch.bfh.projekt1.psyloginanalyzer.config.StaticAnalyseConfig> namedQuery = em.createNamedQuery(StaticAnalyseConfig.GET_CONFIG, ch.bfh.projekt1.psyloginanalyzer.config.StaticAnalyseConfig.class);
    return namedQuery.getSingleResult();
}