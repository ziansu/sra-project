public dreamteam.battleship.logic.movement.MovementStatus shoot(int fieldNumber, dreamteam.battleship.service.springcontroller.registration.Player player) {
    dreamteam.battleship.logic.movement.MovementStatus status = dreamteam.battleship.logic.movement.MovementStatus.INVALID_MOVEMENT;
    if (validatePlayer(player)) {
        status = currentManager.damage(fieldNumber);
    }
    checkPlayer();
    return status;
}