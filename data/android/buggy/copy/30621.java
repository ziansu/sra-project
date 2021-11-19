public void clearFocus(com.cardgamedemo.view.actor.CardActor cardActor) {
    handGroup.swapActor(((cardActor.getIndex()) + 1), cardActor.getIndex());
    cardActor.setFocussed(false);
    focussedCard = null;
}