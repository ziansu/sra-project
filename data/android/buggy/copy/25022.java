@org.springframework.web.bind.annotation.GetMapping(value = "/blogposts/{id}")
reactor.core.publisher.Mono<com.idugalic.domain.blog.BlogPost> findById(@org.springframework.web.bind.annotation.PathVariable
java.lang.String id) {
    com.idugalic.web.blog.BlogPostController.LOG.info("Received request: BlogPost - FindById");
    try {
        return this.blogPostRepository.findOne(id).log();
    } finally {
        com.idugalic.web.blog.BlogPostController.LOG.info("Request pocessed: BlogPost - FindById");
    }
}