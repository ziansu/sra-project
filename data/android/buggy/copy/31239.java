@java.lang.Override
public void stop() throws java.lang.Exception {
    propertyWrapper.savePropertyBeanToJson();
    view.AutoClassMgr.doAllAutoClose();
    super.stop();
}