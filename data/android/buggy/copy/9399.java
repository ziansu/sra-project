public boolean isEnemy(com.epam.training.domain.FieldType field) {
    return (field != (com.epam.training.domain.FieldType.EMPTY)) && (field != (this));
}