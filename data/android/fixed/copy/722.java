@org.springframework.web.bind.annotation.PutMapping(value = "/update/{id}")
public java.lang.String update(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id, com.bsk.domain.User user, org.springframework.ui.Model model) {
    userService.save(user);
    return showHome(model);
}