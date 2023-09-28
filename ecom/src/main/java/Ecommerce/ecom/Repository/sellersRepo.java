package Ecommerce.ecom.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Ecommerce.ecom.Model.sellers;

@Repository
public interface sellersRepo extends JpaRepository<sellers, Long> {
    // You can add custom query methods here if needed
}
