public org.gloria.entity.User findByName(java.lang.String name) {
    org.springframework.data.mongodb.core.query.Query query = org.springframework.data.mongodb.core.query.Query.query(org.springframework.data.mongodb.core.query.Criteria.where("name").is(name));
    return findOne(query, org.gloria.entity.User.class);
}