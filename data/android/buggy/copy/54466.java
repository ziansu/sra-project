@org.springframework.web.bind.annotation.RequestMapping(value = "describe", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String describe(@org.springframework.web.bind.annotation.ModelAttribute(value = "model")
org.springframework.ui.ModelMap model) {
    return "describe";
}