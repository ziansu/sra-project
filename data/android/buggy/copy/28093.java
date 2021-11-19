@org.apache.ibatis.annotations.Select(value = "select * from info_shareholder where sto_id=#{stockId} and issue_date<#{before} " + "order by issue_date desc limit 1")
@org.apache.ibatis.annotations.ResultMap(value = "infoShareholderResultMap")
org.polar.athena.domain.InfoShareholder getLatest(@org.apache.ibatis.annotations.Param(value = "stockId")
int stockId, @org.apache.ibatis.annotations.Param(value = "before")
org.polar.common.MyDate before);