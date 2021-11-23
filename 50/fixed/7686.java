public boolean remove(model.curve.Grade grade) {
    if (grade != null) {
        return curve.remove(grade);
    }
    return false;
}