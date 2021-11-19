public void setValueFilter(float value) {
    styleAttribute.filter_value = value;
    styleAttribute.checkShaderRequirements();
}