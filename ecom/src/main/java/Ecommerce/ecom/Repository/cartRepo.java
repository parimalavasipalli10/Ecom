package Ecommerce.ecom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.cart;

@Repository
public interface cartRepo extends JpaRepository<cart, Long> {
    // You can add custom query methods here if needed
}
