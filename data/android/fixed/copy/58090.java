public void takeOneMore(java.util.List list) {
    java.util.Random rnd = new java.util.Random();
    int szam = rnd.nextInt(45);
    this.dealerCards.add(list.get(szam));
    list.remove(szam);
}