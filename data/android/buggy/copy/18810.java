@java.lang.Override
public int compareTo(eu.eexcess.federatedrecommender.sourceselection.WndomainSourceSelector.DomainWeight o) {
    if (equals(0)) {
        return 0;
    }else
        if ((this.weight) < (o.weight)) {
            return -1;
        }
    
    return 1;
}