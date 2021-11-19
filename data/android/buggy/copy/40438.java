public descarteinterpreter.ProgNode buildTestTree3() {
    new descarteinterpreter.TokenPair("IF", 2);
    descarteinterpreter.ProgNode prog = new descarteinterpreter.ProgNode(30);
    prog.addChild(31);
    prog.addChild(0);
    return prog;
}