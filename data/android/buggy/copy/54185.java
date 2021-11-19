@java.lang.Override
public boolean isDateObject(javax.persistence.TemporalType temper) {
    return (temper == null) || (TemporalType.TIME.equals(temper));
}