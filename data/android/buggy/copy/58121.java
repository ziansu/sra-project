public void onSpeedBoost(float mult, float time) {
    addBuff(new com.ashenrider.game.Buffs.SpeedBuff(this, time, 0.5F));
}