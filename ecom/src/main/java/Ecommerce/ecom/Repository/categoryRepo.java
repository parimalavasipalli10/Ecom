package Ecommerce.ecom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.category;

@Repository
public interface categoryRepo extends JpaRepository<category, Long> {
    // You can add custom query methods here if needed
}
