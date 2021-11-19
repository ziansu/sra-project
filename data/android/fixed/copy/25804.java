@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "/users")
public org.springframework.http.ResponseEntity<?> createUser(@org.springframework.web.bind.annotation.RequestBody
ldap.sample.domain.User user) {
    iposRepository.createUser(user);
    return new org.springframework.http.ResponseEntity(user, org.springframework.http.HttpStatus.CREATED);
}