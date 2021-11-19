@org.springframework.web.bind.annotation.RequestMapping(value = "/delete/{id}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String delete(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id, @org.springframework.web.bind.annotation.RequestParam(required = true)
org.jugbd.mnet.domain.enums.RegistrationType registrationType) {
    java.lang.Long registrationId = visitService.delete(id, registrationType);
    return (((org.jugbd.mnet.web.controller.VisitController.REDIRECT_REGISTER_VISITS_PAGE) + registrationId) + "?registrationType=") + (registrationType.name().toLowerCase());
}