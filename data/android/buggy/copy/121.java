@org.springframework.web.bind.annotation.RequestMapping(value = "/remove/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView removeCart(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id) {
    payCartService.removeCart(id);
    return new org.springframework.web.servlet.ModelAndView("redirect:/cart/listall");
}