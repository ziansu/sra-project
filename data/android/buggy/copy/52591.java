@java.lang.Override
public com.tq.clickfunnel.lambda.dynamodb.model.ContactItem get(java.lang.String email) {
    return loadItem(getItem(), email);
}