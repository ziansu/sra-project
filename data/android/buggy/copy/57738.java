@java.lang.Override
public void handle(javafx.scene.input.MouseEvent t) {
    model.cardBuy(me, cardname);
    Dominion.DynamicCard.ClientControlV2.main.control_buy_card(cardname);
}