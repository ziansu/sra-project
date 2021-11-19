@java.lang.Override
public cl.bomberos.reference.CuerpoReference marshal(cl.bomberos.bean.Cuerpo v) throws java.lang.Exception {
    cl.bomberos.reference.CuerpoReference ref = new cl.bomberos.reference.CuerpoReference();
    ref.id = v.getId();
    return ref;
}