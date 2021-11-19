@com.springapp.mvc.controller.RequestMapping(value = "deleteUser")
public org.springframework.web.servlet.ModelAndView deleteUser(@com.springapp.mvc.controller.RequestParam
long id) {
    userDAO.deleteById(id);
    return new org.springframework.web.servlet.ModelAndView("redirect:getAllUsers");
}