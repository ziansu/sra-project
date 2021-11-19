public void Attacked(int damage) {
    _currentHeath -= damage;
    if ((_currentHeath) <= 0) {
        Died();
    }
    SetIsAttacked(true);
}