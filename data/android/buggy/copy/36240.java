private iot.jcypher.domain.mapping.FieldMapping getFieldMapping() {
    if ((this.fieldMappings) != null)
        return this.fieldMappings.get(this.fmIndex);
    
    return this.fieldMapping;
}