@org.springframework.web.bind.annotation.RequestMapping(value = "/users/insert", method = org.springframework.web.bind.annotation.RequestMethod.POST)
br.com.eits.missoes.domain.entity.User insertUser(@javax.validation.Valid
@org.springframework.web.bind.annotation.RequestBody
br.com.eits.missoes.domain.entity.User user, org.springframework.validation.BindingResult result) {
    if (result.hasErrors()) {
        return null;
    }else {
        return userService.insertUser(user);
    }
}