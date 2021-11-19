@org.springframework.web.bind.annotation.RequestMapping(value = "/cop/smt/djm/detailDeptJob.do")
@org.springframework.security.access.annotation.Secured(value = "ROLE_USER")
public java.lang.String detailDeptJob(aramframework.com.cop.smt.djm.domain.DeptJobVO deptJobVO, org.springframework.ui.ModelMap model) {
    model.addAttribute(deptJobService.selectDeptJob(deptJobVO));
    model.addAttribute("priort", cmmUseService.selectCmmCodeList("COM059"));
    return aramframework.com.cmm.util.WebUtil.adjustViewName("/cop/smt/djm/DeptJobDetail");
}