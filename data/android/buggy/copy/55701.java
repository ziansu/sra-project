com.example.ilnarsabirzyanov.areena.game.Point sub(com.example.ilnarsabirzyanov.areena.game.Point p) {
    com.example.ilnarsabirzyanov.areena.game.Point ans = new com.example.ilnarsabirzyanov.areena.game.Point(p);
    ans.x -= x;
    ans.y -= y;
    return ans;
}