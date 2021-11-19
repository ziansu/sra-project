public java.util.List<com.mitrais.scrummit.model.OrganizationMember> getOrgMembers() {
    org.springframework.data.mongodb.core.query.Query query = new org.springframework.data.mongodb.core.query.Query();
    query.with(new org.springframework.data.domain.Sort(Sort.Direction.ASC, "fullname"));
    return mongoTemplate.find(query, com.mitrais.scrummit.model.OrganizationMember.class);
}