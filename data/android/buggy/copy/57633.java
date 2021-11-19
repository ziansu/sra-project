public org.mockenize.model.MultipleMockBean save(org.mockenize.model.MultipleMockBean mockBean) {
    mockBean.setKey(toKey(mockBean));
    return mockRepository.save(mockBean);
}