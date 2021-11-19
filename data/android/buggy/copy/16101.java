@org.springframework.data.jpa.repository.Query(value = "select max(t.id)  from Tweet as t")
long selectMaxId();