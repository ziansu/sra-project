@org.springframework.web.bind.annotation.RequestMapping(value = "/getBasicDetail/")
public com.web.model.BasicDetailModel getBasicDetail(org.springframework.ui.Model model) {
    java.lang.System.out.println("In basic detail controller");
    return basicDetailService.getBasicDetail();
}