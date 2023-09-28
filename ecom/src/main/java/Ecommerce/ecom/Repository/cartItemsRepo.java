package Ecommerce.ecom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.cartItems;



@Repository
public interface cartItemsRepo extends JpaRepository<cartItems, Long> {
    // You can add custom query methods here if needed
}
