@org.springframework.web.bind.annotation.RequestMapping(value = "/{cartId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getCart(@org.springframework.web.bind.annotation.PathVariable(value = "cartId")
java.lang.Long cartId, org.springframework.ui.Model model) {
    model.addAttribute("cartId", cartId);
    return "cart";
}