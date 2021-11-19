@org.springframework.web.bind.annotation.RequestMapping(value = "/demo")
public java.lang.String demo(javax.servlet.http.HttpServletRequest request) {
    net.eulerframework.web.core.base.request.QueryRequest pr = new net.eulerframework.web.core.base.request.QueryRequest(request);
    java.lang.System.out.println(pr.getOrderMode("a"));
    return "ININININ";
}