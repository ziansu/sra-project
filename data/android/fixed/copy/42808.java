@io.swagger.annotations.ApiOperation(value = "Get a list of teachers by grade level.")
@org.springframework.web.bind.annotation.GetMapping(value = "{gradeLevel}")
public java.util.List<com.libertymutual.goforcode.schoolmanagementsystem.models.Teacher> getAllTeachersByGradeLevel(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer gradeLevel) {
    java.util.List<com.libertymutual.goforcode.schoolmanagementsystem.models.Teacher> list = null;
    if (gradeLevel != null) {
        list = teacherRepo.findByGradeLevel(gradeLevel);
    }
    return list;
}