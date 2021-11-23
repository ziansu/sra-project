public boolean isEnemy(com.epam.training.domain.FieldType field) {
    if ((this) == (com.epam.training.domain.FieldType.EMPTY)) {
        return false;
    }else {
        return (field != (com.epam.training.domain.FieldType.EMPTY)) && (field != (this));
    }
}