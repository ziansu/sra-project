public void updateReviewScore(java.lang.String id, java.lang.String score) {
    database.getCollection("reviews").updateOne(new org.bson.Document("_id", new org.bson.types.ObjectId(id)), new org.bson.Document("$set", new org.bson.Document("score", score)));
}