@io.swagger.annotations.ApiOperation(value = "Get a list of teachers by grade level.")
@org.springframework.web.bind.annotation.GetMapping(value = "{gradeLevel}")
public java.util.List<com.libertymutual.goforcode.schoolmanagementsystem.models.Teacher> getAllTeachersByGradeLevel(int gradeLevel) {
    return teacherRepo.findByGradeLevel(gradeLevel);
}