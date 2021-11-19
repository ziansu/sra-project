@org.springframework.web.bind.annotation.RequestMapping(value = "/shoppingcart/productlist")
public java.lang.String shoppingCartProductList(org.springframework.ui.Model model, javax.servlet.http.HttpSession httpSession) {
    shoppingCart = ((com.onlinemart.model.ShoppingCart) (httpSession.getAttribute("shoppingCart")));
    return "/shoppingcart/productlist";
}