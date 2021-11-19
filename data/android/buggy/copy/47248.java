@java.lang.Override
@msi.gama.precompiler.GamlAnnotations.setter(value = msi.gama.extensions.messaging.GamaMessage.CONTENTS)
public void setContents(final java.lang.Object content) {
    if ((data) != null)
        data.setContent(((msi.gama.util.IList) (content)));
    
}