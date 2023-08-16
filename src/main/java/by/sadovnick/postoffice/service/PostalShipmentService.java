package by.sadovnick.postoffice.service;

import by.sadovnick.postoffice.entity.PostalShipment;
import by.sadovnick.postoffice.entity.ShipmentHistory;
import by.sadovnick.postoffice.repository.PostalShipmentRepository;
import by.sadovnick.postoffice.repository.ShipmentHistoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostalShipmentService {
    private final PostalShipmentRepository postalShipmentRepository;
    private final ShipmentHistoryRepository shipmentRepository;

    public PostalShipmentService(PostalShipmentRepository postalShipmentRepository, ShipmentHistoryRepository shipmentRepository) {
        this.postalShipmentRepository = postalShipmentRepository;
        this.shipmentRepository = shipmentRepository;
    }

    public PostalShipment registerShipment(PostalShipment postalShipment) {
        ShipmentHistory history = new ShipmentHistory();
        history.setTimestamp(LocalDateTime.now());
        history.setFromPostOffice(null);
        history.setToPostOffice(postalShipment.getRecipientIndex());
        postalShipment.addHistory(history);
        return postalShipmentRepository.save(postalShipment);
    }
}
