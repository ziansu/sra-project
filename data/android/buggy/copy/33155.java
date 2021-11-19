public void printWishList(java.io.PrintStream printStream) {
    for (int i = 0; i < (wishList.size()); i++) {
        printStream.println(wishList.get(i).toString());
    }
}