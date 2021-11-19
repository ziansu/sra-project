@org.springframework.web.bind.annotation.PostMapping(value = "/")
public java.lang.String post(@javax.validation.Valid
rohan.validator.web.model.Registration registration, org.springframework.validation.BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
        rohan.validator.web.controllers.BasicController.LOGGER.error(bindingResult.getAllErrors().toString());
    }
    return rohan.validator.web.controllers.BasicController.BASIC_VIEW;
}