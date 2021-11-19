@org.springframework.web.bind.annotation.RequestMapping(value = "/view", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String view(org.springframework.ui.Model model, org.springframework.data.domain.Pageable pageable) {
    org.springframework.data.domain.Page<site.model.Article> articles = adminFacade.findAllArticles(pageable);
    model.addAttribute("articles", articles);
    return "/admin/article/view.jsp";
}