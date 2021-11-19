@java.lang.Override
public com.tq.clickfunnel.lambda.dynamodb.model.CountryItem load(java.lang.String name) {
    if ((name == null) || (name.isEmpty()))
        return null;
    
    return loadItem(name);
}