public void clearFocus(com.cardgamedemo.view.actor.CardActor cardActor) {
    handGroup.swapActor(((cardActor.getIndex()) + 1), cardActor.getIndex());
    focussedCard = null;
}