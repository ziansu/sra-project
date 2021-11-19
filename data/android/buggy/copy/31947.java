@org.springframework.web.bind.annotation.RequestMapping(value = { "guessword" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST }, consumes = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public com.nexmo.dto.AnswerDto guessWord(@org.springframework.web.bind.annotation.RequestBody
com.nexmo.dto.AnswerDto answerDto) throws com.nexmo.exceptions.HangmanException {
    hangmanSvc.processAnswer(null);
    return answerDto;
}