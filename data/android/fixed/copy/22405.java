@org.springframework.web.bind.annotation.PostMapping(value = "/exam")
public com.tw.apistack.core.response.Response createExam(@org.springframework.web.bind.annotation.RequestBody
com.tw.apistack.endpoint.exam.dto.Exam exam) {
    org.springframework.http.HttpStatus httpStatus = (com.tw.apistack.service.ExamService.getInstance().createExam(exam)) ? org.springframework.http.HttpStatus.OK : org.springframework.http.HttpStatus.BAD_REQUEST;
    return new com.tw.apistack.core.response.Response(httpStatus, "", null);
}