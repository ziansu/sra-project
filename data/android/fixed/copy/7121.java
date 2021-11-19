public cf.connotation.editorview.Page addPage() {
    cf.connotation.editorview.Page p = new cf.connotation.editorview.Page(cardList, drawList, drawSubList, back_resource, page);
    page = (page) + 1;
    addPage(p);
    return p;
}