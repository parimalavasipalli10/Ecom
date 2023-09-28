package Ecommerce.ecom.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.products;

@Repository
public interface productsRepo extends JpaRepository<products, Long> {
    // You can add custom query methods here if needed
	List<products> findByCategory_CategoryId(Long category_Id);
}