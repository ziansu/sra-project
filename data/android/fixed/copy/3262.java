@java.lang.Override
public rules.Position makeMove() {
    currentMaxDepth = 0;
    while ((currentMaxDepth) < (MAXDEPTH)) {
        (currentMaxDepth)++;
        bestMove = IDS();
    } 
    return bestMove;
}