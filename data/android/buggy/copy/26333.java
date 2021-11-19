public Decks.DeckManagerComponent.DTOs.CardActionDTO toDTO() {
    return new Decks.DeckManagerComponent.DTOs.CardActionDTO(this.toString(), getNumber());
}