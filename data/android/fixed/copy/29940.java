@org.springframework.web.bind.annotation.RequestMapping(value = "/getquestionsort", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getQuestionSortType(@org.springframework.web.bind.annotation.RequestParam(required = true)
final java.lang.String sessionkey, @org.springframework.web.bind.annotation.RequestParam(required = true)
final java.lang.String subject, @org.springframework.web.bind.annotation.RequestParam(required = true)
final java.lang.String isPreparation) {
    return questionService.getQuestionSortType(sessionkey, isPreparation, subject);
}