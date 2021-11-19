@org.springframework.web.bind.annotation.RequestMapping(value = "/literature_info")
public org.springframework.web.servlet.ModelAndView showMessage(@org.springframework.web.bind.annotation.RequestParam(value = "id", required = true)
java.lang.String id) {
    beans.Literature toView = manager.LiteratureManager.getInstance().searchLiteratureById(java.lang.Long.valueOf(id));
    org.springframework.web.servlet.ModelAndView mv = new org.springframework.web.servlet.ModelAndView("literature_info");
    mv.addObject("literature", toView);
    return mv;
}