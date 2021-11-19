public void updateGenerator(org.apache.carbondata.core.metadata.schema.table.column.CarbonDimension dimension) {
    columnMap.put(dimension.getColumnId(), new org.apache.carbondata.core.dictionary.generator.IncrementalColumnDictionaryGenerator(dimension, 1));
}