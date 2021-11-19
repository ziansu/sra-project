@org.springframework.web.bind.annotation.RequestMapping(value = "/refresh_all", produces = { "text/html; charset=UTF-8;" })
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String refreshAll() {
    try {
        apiJarService.refreshAll();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return "OK";
}