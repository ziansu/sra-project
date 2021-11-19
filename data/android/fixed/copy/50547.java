public static Decks.DeckManagerComponent.CardAction fromDTO(Decks.DeckManagerComponent.DTOs.CardActionDTO dto) {
    java.lang.String cardAction = Decks.DeckManagerComponent.CardAction.valueOf(dto.getName());
    int number = dto.getNumber();
    return new Decks.DeckManagerComponent.CardAction(cardAction, number);
}