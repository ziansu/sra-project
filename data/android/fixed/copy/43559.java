@java.lang.Override
public E convertToModel(D view) {
    if (view == null)
        return null;
    
    E model = getModelInstance(view);
    model.setId(view.getId());
    return model;
}