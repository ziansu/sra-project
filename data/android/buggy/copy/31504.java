@java.lang.Override
public void updateModelState() {
    net.abstractfactory.plum.input.value.File file = getView().getFilePicker().getValue();
    net.abstractfactory.plum.input.value.image.FileImage fileImage = new net.abstractfactory.plum.input.value.image.FileImage(file);
    getModel().setValue(fileImage);
}