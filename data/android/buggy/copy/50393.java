public void DealCmpCard() {
    g.redrawCard(n);
    Computercards.add(g.getCard(n));
    (n)++;
    repaint();
}