@java.lang.Override
public void drink(final org.powerbot.script.rt4.ClientContext ctx) {
    super.drink(ctx);
    org.powerbot.script.Condition.sleep(org.powerbot.script.Random.nextInt(4600, 6000));
}