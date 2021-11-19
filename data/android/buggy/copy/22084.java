private static int alignToEven(final openmods.gui.component.GuiComponentBook book) {
    int index = book.getNumberOfPages();
    if ((index % 2) == 1) {
        book.addPage(PageBase.BLANK_PAGE);
        index++;
    }
    return index;
}