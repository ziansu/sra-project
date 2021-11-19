void setTitle(java.lang.String title) {
    if ((title != null) && ((title.length()) != 0)) {
        mTitle = title;
    }else {
        mTitle = generateGenericTitle();
    }
}