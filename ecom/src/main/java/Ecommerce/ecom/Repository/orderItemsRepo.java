package Ecommerce.ecom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.orderItems;



@Repository
public interface orderItemsRepo extends JpaRepository<orderItems, Long> {
    // You can add custom query methods here if needed
}
