public Card peek_col_card(final int col) {
    if (tableau.get(col).column.isEmpty())
        return null;
    
    return tableau.get(col).column.peek();
}