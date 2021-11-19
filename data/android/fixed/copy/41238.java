@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
br.com.eits.missoes.domain.entity.User login(@org.springframework.web.bind.annotation.RequestBody
br.com.eits.missoes.domain.entity.User user, org.springframework.validation.BindingResult result) {
    return userService.login(user);
}