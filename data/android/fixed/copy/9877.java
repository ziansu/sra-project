@org.apache.ibatis.annotations.Select(value = "SELECT IFNULL((SELECT kode_irs FROM irs WHERE npm = #{npm} AND id_kalender_akademik = #{id_kalender_akademik}),0)")
java.lang.Long selectKode_irs(@org.apache.ibatis.annotations.Param(value = "npm")
java.lang.String npm, @org.apache.ibatis.annotations.Param(value = "id_kalender_akademik")
java.lang.Integer id_kalender_akademik);