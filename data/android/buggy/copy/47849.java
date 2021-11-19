@org.springframework.web.bind.annotation.RequestMapping(value = "{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getStatus(@org.springframework.web.bind.annotation.PathVariable(value = "id")
long id) {
    return "DELIVERED";
}