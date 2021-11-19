@java.lang.Override
public boolean apply(org.openlmis.stockmanagement.domain.StockCard input) {
    return !(stockCardProductCodeList.contains(input.getProduct().getCode()));
}