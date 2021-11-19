protected org.springframework.web.servlet.ModelAndView createSendModelAndView(domain.Message input) {
    org.springframework.web.servlet.ModelAndView result;
    result = createSendModelAndView(input, null, true, true, true, true);
    return result;
}