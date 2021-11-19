@org.springframework.data.jpa.repository.Query(value = "SELECT p from Position p WHERE p.location in (:location) and p.company.id in (:company)")
java.util.List<com.models.Position> filterData(@org.springframework.data.repository.query.Param(value = "location")
java.util.List<java.lang.String> location, @org.springframework.data.repository.query.Param(value = "company")
java.util.List<java.lang.Long> company);