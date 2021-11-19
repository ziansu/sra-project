com.example.ilnarsabirzyanov.areena.game.Point sub(com.example.ilnarsabirzyanov.areena.game.Point p) {
    com.example.ilnarsabirzyanov.areena.game.Point ans = new com.example.ilnarsabirzyanov.areena.game.Point(this);
    ans.x -= p.x;
    ans.y -= p.y;
    return ans;
}