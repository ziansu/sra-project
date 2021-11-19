public boolean equalCheck(com.attender.Event ev) {
    if ((this.getId().compareTo(ev.getId())) == 0)
        return true;
    else
        return false;
    
}