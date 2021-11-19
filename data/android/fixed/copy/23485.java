@org.springframework.web.bind.annotation.CrossOrigin
@org.springframework.web.bind.annotation.GetMapping(path = "/results")
@org.springframework.web.bind.annotation.ResponseBody
public java.util.List<ba.actis.models.User> getByName(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name) {
    return userRepository.findByName(name);
}