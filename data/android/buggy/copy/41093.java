@java.lang.Override
public void run() {
    saveConsolidatedChunks(org.jooq.impl.DSL.using(jooqConfiguration), aggregationMetadata, originalChunks, consolidatedChunks);
}