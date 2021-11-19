@com.emusicstore.controller.RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
@com.emusicstore.controller.ResponseStatus(value = org.springframework.http.HttpStatus.NO_CONTENT)
public void update(@com.emusicstore.controller.PathVariable(value = "cartId")
java.lang.String cartId, @com.emusicstore.controller.RequestBody
com.emusicstore.model.Cart cart) {
    cartDao.update(cartId, cart);
}