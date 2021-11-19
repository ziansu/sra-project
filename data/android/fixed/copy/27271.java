@org.springframework.web.bind.annotation.RequestMapping(value = "/start")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String start() {
    acService.connect();
    return "";
}