public void delete(java.lang.Long cartId) {
    if (!(listOfCarts.containsKey(cartId))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format(("Cannot delete cart. " + "The cart doesn't exist"), cartId));
    }
    listOfCarts.remove(cartId);
}