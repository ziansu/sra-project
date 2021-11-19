@org.springframework.data.jpa.repository.Query(value = "SELECT COUNT(e.id) FROM TeachingExperience e JOIN e.subject s WHERE s.id=:subjectId " + (("AND (:from BETWEEN e.teachingStartDate AND IFNULL(e.teachingEndDate, NOW()) " + "OR :to BETWEEN e.teachingStartDate AND IFNULL(e.teachingEndDate, NOW()) OR e.teachingStartDate BETWEEN :from AND :to ") + "OR IFNULL(e.teachingEndDate, NOW()) BETWEEN :from AND :to)"))
int isThereTeachingExperienceWithSimilarPeriod(@org.springframework.data.repository.query.Param(value = "subjectId")
java.lang.Long subjectId, @org.springframework.data.repository.query.Param(value = "from")
java.util.Date from, @org.springframework.data.repository.query.Param(value = "to")
java.util.Date to);