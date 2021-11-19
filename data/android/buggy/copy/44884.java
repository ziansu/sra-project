@org.springframework.web.bind.annotation.RequestMapping(value = "/setsort", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void setQuestionSortOrder(@org.springframework.web.bind.annotation.PathVariable
final java.lang.String questionId, @org.springframework.web.bind.annotation.RequestParam(required = false)
final java.lang.Boolean publish, @org.springframework.web.bind.annotation.RequestBody
final de.thm.arsnova.entities.Question question) {
    if (publish != null) {
        question.setActive(publish);
    }
    questionService.update(question);
}