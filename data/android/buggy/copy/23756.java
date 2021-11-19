private void startLevel(nl.avans.model.BaseLevelState level) {
    this.round = new nl.avans.model.Round(1, nl.avans.enums.DuckPoints.LOW, 6, _moveContainer);
    level.Update(0);
}