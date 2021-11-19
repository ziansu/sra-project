@java.lang.Override
public void onKeyPress(long keyCode) {
    net.abstractfactory.plum.interaction.context.InteractionContextUtils.getInteractionManager().inform(("you press key:" + keyCode));
    java.lang.System.out.println(("clicked " + keyCode));
}