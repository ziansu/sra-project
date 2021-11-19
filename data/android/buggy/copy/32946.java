@java.lang.Override
public java.util.Vector<de.hdm.tellme.shared.bo.Nutzer> getAlleNutzer(boolean zwingeNeuladen) {
    if (((de.hdm.tellme.server.EditorServiceImpl.alleUser) == null) || zwingeNeuladen)
        de.hdm.tellme.server.EditorServiceImpl.alleUser = nutzerMapper.alleNutzer(0);
    
    return de.hdm.tellme.server.EditorServiceImpl.alleUser;
}