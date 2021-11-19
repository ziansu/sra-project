@org.springframework.web.bind.annotation.RequestMapping(value = "/outcomeMessages")
public org.springframework.web.servlet.ModelAndView outcomeMessages() {
    java.util.List<org.mycompany.model.entity.Message> outcomeMessages = messageService.getOutcomeMessages();
    org.springframework.web.servlet.ModelAndView modelAndView = new org.springframework.web.servlet.ModelAndView(org.mycompany.controller.MessageController.OUTCOME_MESSAGES);
    modelAndView.addObject("messages", outcomeMessages);
    return modelAndView;
}