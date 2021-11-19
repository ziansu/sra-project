public org.springframework.data.domain.Page<es.test.vessel.entities.Vessel> findByNameContainingAndPointNearAndWidthBetween(@org.springframework.data.repository.query.Param(value = "name")
java.lang.String name, @org.springframework.data.repository.query.Param(value = "point")
org.springframework.data.geo.Point point, @org.springframework.data.repository.query.Param(value = "distance")
org.springframework.data.geo.Distance distance, @org.springframework.data.repository.query.Param(value = "from")
java.lang.Float from, @org.springframework.data.repository.query.Param(value = "to")
java.lang.Float to, org.springframework.data.domain.Pageable pageable);