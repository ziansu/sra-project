@org.springframework.web.bind.annotation.RequestMapping(value = "/labelUpdateOrInsert")
public java.lang.Boolean labelUpdateOrInsert(com.apcompany.user.pojo.TLabelsRel tlabelsrel, org.springframework.ui.Model model) {
    int count = dataService.insertOrUpateTLabelsRel(tlabelsrel);
    return count > 0;
}