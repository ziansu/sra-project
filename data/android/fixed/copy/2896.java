@education.web.platform.controllers.RequestMapping(value = { "/tasks/theory/add" , "/tasks/theory/edit/{id}" }, params = { "addAnswer" })
public java.lang.String addAnswer(@javax.validation.Valid
education.web.platform.models.tasks.TheoryTask theoryTask, final org.springframework.validation.BindingResult bindingResult) {
    theoryTask.getProbablyAnswers().add(new education.web.platform.models.answers.ProbablyAnswer());
    return "addTheoryTask";
}