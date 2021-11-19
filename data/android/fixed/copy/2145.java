@org.springframework.data.jpa.repository.Query(value = "select a from AreaDetail a where a.location=:location")
public po.AreaDetail findByLocation(@org.springframework.data.repository.query.Param(value = "location")
java.lang.String location);