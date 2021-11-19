@org.springframework.web.bind.annotation.RequestMapping(value = "/idCheck.html")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String idCheck(java.lang.String sid) throws java.lang.Exception {
    int cnt = userService.idCheck(sid);
    org.json.simple.JSONObject json = new org.json.simple.JSONObject();
    json.put("idcount", cnt);
    return json.toJSONString();
}