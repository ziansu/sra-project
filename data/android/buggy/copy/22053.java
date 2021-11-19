@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
@org.springframework.web.bind.annotation.ResponseBody
public com.ccloomi.core.common.bean.Message deleteRole(java.lang.String roleid) {
    com.ccloomi.core.common.bean.Message m = new com.ccloomi.core.common.bean.Message();
    roleService.delete(roleid);
    m.setCode("0");
    return m;
}