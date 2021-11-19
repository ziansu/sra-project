@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/users/{userId:.+}")
public org.springframework.http.ResponseEntity<?> findUser(@org.springframework.web.bind.annotation.PathVariable
java.lang.String userId) {
    ldap.sample.domain.User user = iposRepository.findUser(userId);
    return new org.springframework.http.ResponseEntity(user, org.springframework.http.HttpStatus.FOUND);
}