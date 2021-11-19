public void resetId() {
    java.lang.System.out.println(this.id);
    this.id = com.footopia.shoppinglist.ShoppingItem.count.incrementAndGet();
    java.lang.System.out.println(this.id);
}