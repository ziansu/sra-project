@org.springframework.web.bind.annotation.RequestMapping(value = "/categories/{id}", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public org.springframework.http.ResponseEntity<com.ted.stream.mongo.entity.Category> updateCategory(@org.springframework.web.bind.annotation.PathVariable
com.ted.stream.mongo.entity.Category category) {
    return org.springframework.http.ResponseEntity.ok(categoryService.updateCategory(category));
}