public org.springframework.data.domain.Page<es.test.vessel.entities.Vessel> findByNameContainingAndWidthBetweenAndLengthBetweenAndDraftBetween(@org.springframework.data.repository.query.Param(value = "point")
org.springframework.data.geo.Point point, @org.springframework.data.repository.query.Param(value = "distance")
org.springframework.data.geo.Distance distance, @org.springframework.data.repository.query.Param(value = "widthFrom")
java.lang.Float widthFrom, @org.springframework.data.repository.query.Param(value = "widthTo")
java.lang.Float widthTo, @org.springframework.data.repository.query.Param(value = "lengthFrom")
java.lang.Float lengthFrom, @org.springframework.data.repository.query.Param(value = "lengthTo")
java.lang.Float lengthTo, @org.springframework.data.repository.query.Param(value = "draftFrom")
java.lang.Float draftFrom, @org.springframework.data.repository.query.Param(value = "draftTo")
java.lang.Float draftTo, org.springframework.data.domain.Pageable pageable);