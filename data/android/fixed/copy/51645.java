private void setGameView(GameView view) {
    v = view;
    v.setControl(this);
    v.setGoldLabel(m.getGold());
    v.setMaxProgress(m.getNumAttackers());
}