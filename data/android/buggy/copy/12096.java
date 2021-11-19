@org.springframework.web.bind.annotation.RequestMapping(value = "/leave/listAll/{id}", method = { org.springframework.web.bind.annotation.RequestMethod.GET , org.springframework.web.bind.annotation.RequestMethod.POST })
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<com.aug.hrdb.dto.LeaveDto> listAll(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Integer id) {
    findOfficial(id);
    return ((java.util.List<com.aug.hrdb.dto.LeaveDto>) (leaveDtoService.searchLeave(id)));
}