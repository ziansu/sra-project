@org.springframework.web.bind.annotation.RequestMapping(value = "/search")
public java.lang.String search(org.springframework.ui.Model model, java.lang.String searchTerm, javax.servlet.http.HttpServletRequest request) {
    model.addAttribute("searchTerm", searchTerm);
    return "search";
}