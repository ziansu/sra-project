@java.lang.Override
public final com.questdb.Journal reader(java.lang.String name) throws com.questdb.ex.JournalException {
    return reader(new com.questdb.JournalKey(name));
}