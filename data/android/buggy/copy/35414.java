private static model.messages.Response<java.lang.String> keygroupCreate(database.IControllable controller, java.lang.String content, model.data.NodeID senderID) {
    model.config.KeygroupConfig keygroup = model.JSONable.fromJSON(content, model.config.KeygroupConfig.class);
    return namespace.Keygroup.getInstance().createKeygroup(controller, keygroup);
}