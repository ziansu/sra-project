@java.lang.Override
public int gainmojo(int x) {
    return ((int) (((double) (x)) / (nightgames.global.Global.getPlayer().getAddiction(AddictionType.ZEAL).getMagnitude())));
}