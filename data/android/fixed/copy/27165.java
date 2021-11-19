@org.apache.ibatis.annotations.Select(value = "SELECT IFNULL((SELECT SUM(sesi) FROM kelas_diambil kd, kelas k, mata_kuliah mk WHERE kd.kode_kelas = k.kode_kelas AND k.kode_mata_kuliah = mk.kode_mata_kuliah AND npm = #{npm} AND kd.id_kalender_akademik = #{id_kalender_akademik}), 0)")
java.lang.Integer getCoursePlanSessionSum(@org.apache.ibatis.annotations.Param(value = "npm")
java.lang.String npm, @org.apache.ibatis.annotations.Param(value = "id_kalender_akademik")
java.lang.Integer id_kalender_akademik);