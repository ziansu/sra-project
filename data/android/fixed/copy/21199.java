@org.springframework.web.bind.annotation.RequestMapping(value = "/candidateOffice", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String goLogin(@org.springframework.web.bind.annotation.ModelAttribute(value = "loginForm")
ua.com.jobsukraine.entity.LoginInfo loginInfo, java.util.Map<java.lang.String, java.lang.Object> model) {
    model.put("candidate", cs.findByLogin(loginInfo.getLogin()));
    return "candidateOffice";
}