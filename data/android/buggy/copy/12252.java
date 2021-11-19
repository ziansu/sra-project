@org.springframework.web.bind.annotation.RequestMapping(value = "/{account}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String show(@org.springframework.web.bind.annotation.PathVariable
java.lang.String account, @org.springframework.web.bind.annotation.RequestParam(required = false)
org.joda.time.LocalDate date) {
    return "redirect/redirectResults";
}