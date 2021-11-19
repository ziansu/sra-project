@org.springframework.data.jpa.repository.Query(value = "from StockInDetail as s where s.depart = :depart and s.deleted=:deleted and s.status in ('可用','借用','申领') and s.stockIn.weapon.name like %:name% ")
java.util.List<io.jianxun.business.domain.stock.StockInDetail> findByDepartAndStatusAndDeletedAndName(@org.springframework.data.repository.query.Param(value = "depart")
io.jianxun.business.domain.Department department, @org.springframework.data.repository.query.Param(value = "deleted")
io.jianxun.business.enums.BooleanStatus deleted, @org.springframework.data.repository.query.Param(value = "name")
java.lang.String name);