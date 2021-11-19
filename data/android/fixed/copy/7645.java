private void addPencil(int value) {
    validateValue(value);
    pencils.add(value);
    java.util.Collections.sort(pencils);
}