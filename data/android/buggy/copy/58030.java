@org.springframework.web.bind.annotation.RequestMapping(value = "/all", produces = { "text/html; charset=UTF-8;charset=UTF-8" })
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String showAll() {
    try {
        apiJarService.refreshAll();
        java.lang.System.out.println(apiRegisterService.getAll());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return "OK";
}