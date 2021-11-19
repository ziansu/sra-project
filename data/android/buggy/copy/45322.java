public javagfx.lib2d.Sprite getSprite(int n, int m) {
    int y = ((int) ((width) / (spritew)));
    return sprites.get((n + (m * y)));
}