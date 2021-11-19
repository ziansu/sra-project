@java.lang.Override
@msi.gama.precompiler.GamlAnnotations.getter(value = msi.gama.extensions.messaging.GamaMessage.CONTENTS)
public java.lang.Object getContents() {
    setUnread(false);
    return data.getContent();
}