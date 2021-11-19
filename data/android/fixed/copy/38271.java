public org.gloria.entity.User findById(java.lang.String id) {
    org.springframework.data.mongodb.core.query.Query query = org.springframework.data.mongodb.core.query.Query.query(org.springframework.data.mongodb.core.query.Criteria.where("_id").is(new org.bson.types.ObjectId(id)));
    return super.findOne(query, org.gloria.entity.User.class);
}