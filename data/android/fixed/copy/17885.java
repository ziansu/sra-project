@java.lang.Override
public int compare(com.onefengma.taobuxiu.model.entities.SupplyBrief one, com.onefengma.taobuxiu.model.entities.SupplyBrief two) {
    if ((one.supplyPrice) < (two.supplyPrice)) {
        return -1;
    }else
        if ((one.supplyPrice) > (two.supplyPrice)) {
            return 1;
        }
    
    return 0;
}