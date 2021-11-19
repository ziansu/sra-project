@org.springframework.web.bind.annotation.RequestMapping(value = "UNmark-as-problem-of-the-day", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String UNmarkAsProblemOfTheDay(@org.springframework.web.bind.annotation.RequestParam(value = "problem-id")
long problemId) {
    com.davidbalazs.chess.controllers.administration.AdministrationProblemPageController.LOGGER.info(java.text.MessageFormat.format(com.davidbalazs.chess.controllers.administration.AdministrationProblemPageController.UNMARK_AS_PROBLEM_OF_THE_DAY_LOG_MESSAGE, problemId));
    chessProblemService.unmarkAsProblemOfTheDay(problemId);
    return "redirect:show-all";
}