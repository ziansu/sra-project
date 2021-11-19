@org.springframework.web.bind.annotation.RequestMapping(value = "/datatable")
@org.springframework.web.bind.annotation.ResponseBody
public com.hames.util.model.DatatableResponse viewDataTable(@org.springframework.web.bind.annotation.ModelAttribute
com.hames.util.model.DatatableRequest datatableRequest) {
    return projectDetailsService.getDatatable(datatableRequest);
}