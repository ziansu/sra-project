@org.springframework.web.bind.annotation.RequestMapping(value = "/index", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String index(@org.springframework.web.bind.annotation.ModelAttribute(value = "model")
org.springframework.ui.ModelMap model) {
    org.springframework.jdbc.core.JdbcTemplate jt = new org.springframework.jdbc.core.JdbcTemplate(dataSource);
    return "index";
}