@org.springframework.web.bind.annotation.PostMapping(value = "/process")
public java.lang.String processForm(@javax.validation.Valid
me.jerilynmensah.bullhorn02.Message messages, org.springframework.validation.BindingResult result) {
    if (result.hasErrors()) {
        return "messageform";
    }
    messageRepository.save(messages);
    return "redirect:/";
}