public java.util.Set<CoreNLP.NamedEntity> get_entities(java.lang.String text) {
    org.insightcentre.nerservice.StanfordCoreNLPHandler.logger.info(("Get entities for :" + text));
    entities.getNamedEntities(text);
    return null;
}