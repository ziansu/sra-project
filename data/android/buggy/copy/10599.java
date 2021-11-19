@android.support.annotation.Nullable
public java.lang.String getSupervisor(int i) {
    for (com.nmakademija.nmaakademija.entity.Section section : sections)
        if ((section.getId()) == i)
            return section.getSupervisor();
        
    
    return null;
}