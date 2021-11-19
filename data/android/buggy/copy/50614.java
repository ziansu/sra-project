@org.springframework.web.bind.annotation.RequestMapping(value = "/rest/{userName}/{lastName}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public com.usermanagement.model.User searchUser(@org.springframework.web.bind.annotation.PathVariable
java.lang.String userName, @org.springframework.web.bind.annotation.PathVariable
java.lang.String lastName) {
    return userRepository.findOne(((long) (1)));
}