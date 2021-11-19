public boolean writeToDB(java.lang.String s, java.lang.String u) throws java.net.UnknownHostException {
    com.mongodb.BasicDBObject doc = new com.mongodb.BasicDBObject("title", s);
    doc.append("url", u);
    coll.insert(doc);
    return true;
}