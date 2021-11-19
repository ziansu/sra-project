@org.xine.marketplace.repository.util.Transactional
private void delete(org.xine.marketplace.model.entities.Product product) {
    try {
        this.repository.remove(product);
    } catch (org.xine.marketplace.repository.exceptions.RepositoryException e) {
        throw new org.xine.marketplace.business.BusinessException("O produto não pode ser removido, pois esta esta a ser utilizado.");
    }
}