@org.springframework.web.bind.annotation.RequestMapping(value = "/welcome")
public org.springframework.web.servlet.ModelAndView helloWorld() {
    java.lang.System.out.println(com.exitIntent.Client.ScoreCalculate.calculateScore());
    java.lang.String message = com.exitIntent.Client.ScoreCalculate.calculateScore();
    return new org.springframework.web.servlet.ModelAndView("welcome", "message", message);
}