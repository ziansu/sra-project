@org.springframework.web.bind.annotation.RequestMapping(value = "pathVariables/{foo}/{fruit}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String pathVars() {
    return "views/html";
}