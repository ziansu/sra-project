public org.springframework.data.domain.Page<es.test.vessel.entities.Vessel> findByNameContainingAndPointNearAndWidthBetweenAndLengthBetween(@org.springframework.data.repository.query.Param(value = "point")
org.springframework.data.geo.Point point, @org.springframework.data.repository.query.Param(value = "distance")
org.springframework.data.geo.Distance distance, @org.springframework.data.repository.query.Param(value = "widthFrom")
java.lang.Float widthFrom, @org.springframework.data.repository.query.Param(value = "widthTo")
java.lang.Float widthTo, @org.springframework.data.repository.query.Param(value = "lengthFrom")
java.lang.Float lengthFrom, @org.springframework.data.repository.query.Param(value = "lengthTo")
java.lang.Float lengthTo, org.springframework.data.domain.Pageable pageable);