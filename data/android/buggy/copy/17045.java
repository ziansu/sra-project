@java.lang.Override
public void execute(amazon_product_metadata_parser.dto.ProductDTO productDTO) {
    statementsToExecute.executeProductStatements(productDTO);
    updateCounts();
}