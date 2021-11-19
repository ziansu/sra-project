@java.lang.Override
public void closeDb() {
    lucene.commit();
    lucene.closeDb();
}