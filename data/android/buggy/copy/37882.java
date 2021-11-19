@org.springframework.web.bind.annotation.RequestMapping(value = "{id}", params = "pId", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.web.servlet.ModelAndView deleteM(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String pId, org.springframework.web.servlet.mvc.support.RedirectAttributes redirect) {
    com.aetsmtl.ptc.servletControllerPocTeamCloud.MemberController.memberControllerLogger.info(" $$$ Deleting a Member");
    mDAO.deleteMember(java.lang.Long.parseLong(pId));
    return new org.springframework.web.servlet.ModelAndView("redirect:/mb");
}