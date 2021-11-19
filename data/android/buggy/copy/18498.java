@java.lang.Override
public void validate(cc.redpen.model.Section section) {
    int paragraphNumber = section.getNumberOfParagraphs();
    if ((getInt("max_num")) < paragraphNumber) {
        addLocalizedError(section.getJoinedHeaderContents(), paragraphNumber);
    }
}