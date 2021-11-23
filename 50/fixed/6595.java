public void reset() {
    directors.Screen demoScreen = new Demo.EnemyBattleScreen(this);
    setScreen(demoScreen);
    repaint();
}