@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.DELETE, value = "topics/{topicId}/courses/{id}")
public void DeleteCourse(@org.springframework.web.bind.annotation.PathVariable
java.lang.String id) {
    this.courseService.deleteCourse(new com.Employee.DataManagement.course.KeyId(id, null));
}