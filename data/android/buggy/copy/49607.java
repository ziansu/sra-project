@com.zpi2016.controller.RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
public void deleteUserWithId(@com.zpi2016.controller.PathVariable
java.lang.Integer id) {
    userService.delete(userService.findOne(id));
}