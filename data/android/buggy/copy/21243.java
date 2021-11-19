@java.lang.Override
public void discard() {
    client.model.ClientGame.getGame().DiscardCards(resourceList);
    getDiscardView().closeModal();
    initResourceList();
    client.model.ClientGame.getGame().doneDiscarding();
}