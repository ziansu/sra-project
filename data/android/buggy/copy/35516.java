@org.springframework.web.bind.annotation.RequestMapping(value = "/teacher/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getByAcademyId(@javax.ws.rs.QueryParam(value = "academyid")
final java.lang.String academyid) {
    java.util.List<com.restsiqs.Entities.Teacher> list = teacherService.findAll();
    java.lang.System.out.println(academyid);
    return new com.restsiqs.Utils.JsonUtils(list).getJsonObject().toJSONString();
}