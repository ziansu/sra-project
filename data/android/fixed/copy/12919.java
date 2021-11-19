@java.lang.Override
public void delete(long id) {
    se.l4.silo.engine.internal.index.IndexQueryEngine.logger.debug("{}: Delete entry for id {}", name, id);
    java.lang.Object[] previousKey = indexedData.get(id);
    remove(previousKey, id);
    indexedData.remove(id);
}