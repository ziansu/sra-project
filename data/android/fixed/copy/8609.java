@org.springframework.data.jpa.repository.Query(value = "select s, s.user from Student s where s.program.id = ?1")
java.util.List<java.lang.Object[]> findAllByProgram_Id(java.lang.Integer programId);