@java.lang.Override
public boolean isDateObject(javax.persistence.TemporalType temper) {
    return TemporalType.TIME.equals(temper);
}