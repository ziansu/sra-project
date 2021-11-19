fit.Parse secondLastRow(fit.Parse lastRow) {
    fit.Parse nextRow = table.parts;
    fit.Parse currentRow = null;
    while (nextRow != lastRow) {
        currentRow = nextRow;
        nextRow = nextRow.more;
    } 
    if (currentRow != null) {
        currentRow.more = null;
    }
    return currentRow;
}