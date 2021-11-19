public static void throwException(int domain, int code) throws com.couchbase.cbforest.ForestException {
    com.couchbase.cbforest.ForestException x = new com.couchbase.cbforest.ForestException();
    x.domain = domain;
    x.code = code;
    throw x;
}