@org.springframework.web.bind.annotation.RequestMapping(value = { "/argos/sites" })
@org.springframework.web.bind.annotation.ResponseBody
private java.lang.String getArgosSites(@org.springframework.web.bind.annotation.RequestParam
short domain_id, @org.springframework.web.bind.annotation.RequestParam(required = false, defaultValue = "jennifer")
java.lang.String customer_id) throws java.net.MalformedURLException {
    java.net.URL u = new java.net.URL((((((com.jennifersoft.ctrl.ArgosController.ARGOS_API_URL) + "?func_name=getSiteListForJennifer&domain_id=") + domain_id) + "&customer_id=") + customer_id));
    return getArgosContents(u);
}