@java.lang.Override
public void assign(com.jaamsim.input.ExpResult ent, com.jaamsim.input.ExpResult index, com.jaamsim.input.ExpResult val) throws com.jaamsim.input.ExpError {
    if (index == null) {
        cont.res = val;
    }else {
        cont.col.assign(index, val);
    }
    cont.lastAttribName = attribName;
}