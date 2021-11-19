public void player_drawFromDiscard(com.nick_toffle.Discard d) {
    this.getCards().put(((this.getCards().size()) + 1), d.drawDiscard());
}