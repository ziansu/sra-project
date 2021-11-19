private java.lang.String checkIfValidCheckOut() {
    java.lang.System.out.println("Please, write the title of the book you want to checkout");
    java.lang.String titleToCheckout = ask();
    java.lang.String result = (catalogue.checkoutBook(titleToCheckout)) ? printSeparator() : checkIfValidReturn();
    return result;
}