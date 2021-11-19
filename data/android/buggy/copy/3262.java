@java.lang.Override
public rules.Position makeMove() {
    while ((currentMaxDepth) < (MAXDEPTH)) {
        (currentMaxDepth)++;
        bestMove = IDS();
    } 
    return bestMove;
}