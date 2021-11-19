@org.springframework.web.bind.annotation.GetMapping(value = "/")
public java.lang.String index(javax.servlet.http.HttpSession session, org.springframework.ui.Model model) {
    infinitefire.project.web.IssueController.log.debug(("Access >> / " + (session.getAttribute(HttpSessionUtils.USER_SESSION_KEY))));
    model.addAttribute("issueList", issueRepository.findAll());
    return "index";
}