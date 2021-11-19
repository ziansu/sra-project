@java.lang.Override
public void run() {
    saveCommit(org.jooq.impl.DSL.using(jooqConfiguration), log, oldPositions, newPositions, newChunks);
}