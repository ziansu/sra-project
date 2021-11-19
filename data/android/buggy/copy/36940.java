@org.springframework.web.bind.annotation.RequestMapping(value = "/index")
public java.lang.String index() {
    for (int i = 0; i < 10000; i++) {
        java.lang.System.out.println(i);
    }
    return "index";
}