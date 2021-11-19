@org.springframework.data.jpa.repository.Query(value = "select i from Item i where i.itemType = :itemType", countQuery = "select count(i) from Item i where i.itemType = :itemType")
org.springframework.data.domain.Page<com.es.masjid.madmin.model.Item> findAllItems(@org.springframework.data.repository.query.Param(value = "currentDate")
java.util.Date currentDate, @org.springframework.data.repository.query.Param(value = "itemType")
com.es.masjid.madmin.model.ItemType itemType, org.springframework.data.domain.Pageable pageable);