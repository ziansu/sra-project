public void DoMove(lenz.htw.kimpl.Move Move) {
    CopyMove(Move);
    client.game.Board.RotateMove(MoveBuffer, CurrentDirection);
    ProcessMove(Move);
}