@java.lang.Override
public void addError(java.lang.String error) {
    if (error == null)
        errors = new java.util.ArrayList<java.lang.String>();
    
    errors.add(error);
}