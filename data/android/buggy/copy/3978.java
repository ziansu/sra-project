@org.springframework.web.bind.annotation.RequestMapping(value = "/datatable")
@org.springframework.web.bind.annotation.ResponseBody
public com.hames.util.model.DatatableResponse viewDataTable(@org.springframework.web.bind.annotation.ModelAttribute
com.hames.util.model.DatatableRequest datatableRequest) {
    com.hames.bean.criteria.ProjectDetailsCriteria criteria = new com.hames.bean.criteria.ProjectDetailsCriteria();
    criteria.setEngineer(UserContext.staff.getStaffId());
    datatableRequest.setCriteria(criteria);
    return projectDetailsService.getDatatable(datatableRequest);
}