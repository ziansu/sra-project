public static int getSpinnerLabelEmail(int type) {
    switch (type) {
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_EMAIL_HOME :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_HOME;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_EMAIL_WORK :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_WORK;
        case com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.FIELD_TYPE_EMAIL_OTHER :
            return com.roberts.adrian.androidcodetestadrianroberts.ContactEditorActivity.TYPE_INDEX_OTHER;
        default :
            return 0;
    }
}