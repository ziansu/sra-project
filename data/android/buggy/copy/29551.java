@org.springframework.web.bind.annotation.RequestMapping(value = "/gmessage")
public java.lang.String gmessage(@org.springframework.web.bind.annotation.RequestBody(required = false)
java.lang.String input) {
    log.info(("received message" + (java.util.Optional.ofNullable(input).orElse("null"))));
    return "success, received:" + input;
}