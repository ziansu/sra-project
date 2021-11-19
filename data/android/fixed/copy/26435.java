@org.springframework.data.jpa.repository.Query(value = "SELECT d FROM Duck d WHERE " + (((("LOWER(d.duckOwner.firstName)   LIKE LOWER(CONCAT(:ownerFirstName,'%')) AND " + "LOWER(d.duckOwner.lastName)    LIKE LOWER(CONCAT(:ownerLastName,'%'))  AND ") + "LOWER(d.duckBuyer.email)       LIKE LOWER(CONCAT(:email,'%'))          AND ") + "     (d.race.beginning)       = :date                                  AND ") + "LOWER(d.duckOwner.phoneNumber) LIKE LOWER(CONCAT(:phone,'%'))"))
java.util.List<ee.pardiralli.domain.Duck> findDuck(@org.springframework.data.repository.query.Param(value = "ownerFirstName")
java.lang.String ownerFirstName, @org.springframework.data.repository.query.Param(value = "ownerLastName")
java.lang.String ownerLastName, @org.springframework.data.repository.query.Param(value = "email")
java.lang.String email, @org.springframework.data.repository.query.Param(value = "phone")
java.lang.String phone, @org.springframework.data.repository.query.Param(value = "date")
java.util.Date date, org.springframework.data.domain.Pageable pageable);