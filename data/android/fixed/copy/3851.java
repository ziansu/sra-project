public SymbolTable createChild() {
    SymbolTable child = new SymbolTable(this, packageSymbols());
    addChild(child);
    return child;
}