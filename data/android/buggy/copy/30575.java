public java.lang.String getValidField(java.lang.String field, ru.alexbykov.novalid.utils.Gender gender) {
    return isValidField(field) ? getEmptyDefaultField(gender) : field;
}