@java.lang.Override
public int compareTo(eu.eexcess.federatedrecommender.sourceselection.WndomainSourceSelector.DomainWeight o) {
    if (equals(o)) {
        return 0;
    }else
        if ((this.weight) < (o.weight)) {
            return -1;
        }
    
    return 1;
}