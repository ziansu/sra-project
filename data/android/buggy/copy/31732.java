@com.greenfox.controllers.RequestMapping(value = "/posts/add")
public java.lang.String addPost(org.springframework.ui.Model model) {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    model.addAttribute("userName", auth.getName());
    model.addAttribute("post", new com.greenfox.domain.Post());
    return "add";
}