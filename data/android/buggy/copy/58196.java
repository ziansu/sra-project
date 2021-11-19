@java.lang.Override
public void onSecond(long seconds) {
    pl.themolka.arcade.time.Time now = pl.themolka.arcade.time.Time.now();
    this.lastLostTicks = (now.minus(this.lastTime).toMillis()) - 0.02F;
    this.lastTime = now;
}