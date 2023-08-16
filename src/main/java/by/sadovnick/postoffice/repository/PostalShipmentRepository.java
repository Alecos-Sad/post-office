package by.sadovnick.postoffice.repository;

import by.sadovnick.postoffice.entity.PostalShipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostalShipmentRepository extends JpaRepository<PostalShipment, Long> {
}
