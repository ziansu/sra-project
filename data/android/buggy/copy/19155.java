@org.apache.ibatis.annotations.Select(value = "select count(Distinct d.tofacilityid) total from vaccine_distributions d\n" + "where d.periodid=#{periodId} and d.fromfacilityid=#{facilityId}")
java.lang.Integer getTotalDistributedFacilities(@org.apache.ibatis.annotations.Param(value = "periodId")
java.lang.Long periodId, @org.apache.ibatis.annotations.Param(value = "facilityId")
java.lang.Long facilityId);