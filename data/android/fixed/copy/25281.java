public void edit(seedu.emeraldo.model.task.Task toEditObj, int index, seedu.emeraldo.model.task.Description toEditField) throws seedu.emeraldo.commons.exceptions.IllegalValueException {
    assert toEditField != null;
    toEditObj.setDescription(toEditField);
    internalList.set(index, toEditObj);
}