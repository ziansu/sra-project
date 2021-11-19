public void doAction(final magic.model.MagicPermanent permanent) {
    game.doAction(magic.model.action.ChangeStateAction.Set(event.getPermanent(), MagicPermanentState.Exploit));
    game.doAction(new magic.model.action.SacrificeAction(permanent));
}