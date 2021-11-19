@org.apache.ibatis.annotations.Select(value = "select h.name from prescription as p, hospital as h " + "where p.process = #{process} and p.hospital_id = h.id")
java.util.List<java.lang.String> listInProgressHospitalwithProcess(@org.apache.ibatis.annotations.Param(value = "process")
int process);