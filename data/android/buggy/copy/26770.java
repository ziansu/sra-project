@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/user{id}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public java.lang.String deleteUser(@org.springframework.web.bind.annotation.PathVariable
java.lang.Long id) {
    userDao.delete(userDao.getUserByid(id));
    return "redirect:/users";
}