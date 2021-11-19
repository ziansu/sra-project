public org.dbflute.erflute.editor.model.diagram_contents.not_element.dictionary.TypeData getTypeData() {
    if ((getFirstReferredColumn()) != null) {
        return getFirstReferredColumn().getTypeData();
    }
    return word.getTypeData();
}