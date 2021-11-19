@java.lang.Override
public java.util.List<com.eswaraj.web.dto.CategoryWithChildCategoryDto> getAllCategories() throws com.eswaraj.core.exceptions.ApplicationException {
    java.util.List<com.eswaraj.domain.nodes.Category> allCategories = categoryRepository.getAllCategories();
    return categoryConvertor.convertCategoryWithChildren(allCategories);
}