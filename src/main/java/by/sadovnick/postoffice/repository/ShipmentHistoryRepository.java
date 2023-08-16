package by.sadovnick.postoffice.repository;

import by.sadovnick.postoffice.entity.ShipmentHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentHistoryRepository extends JpaRepository<ShipmentHistory, Long> {
}
