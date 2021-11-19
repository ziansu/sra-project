@java.lang.Override
public void addPlayerTime(chess.domain.Time timeToAdd) {
    chess.domain.Time whoseTime = ((whoseMove) == (chess.domain.Colors.WHITE)) ? blackTime : whiteTime;
    whoseTime.add(timeToAdd);
}