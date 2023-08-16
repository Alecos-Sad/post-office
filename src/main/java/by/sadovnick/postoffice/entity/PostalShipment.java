package by.sadovnick.postoffice.entity;

import by.sadovnick.postoffice.enums.ShipmentType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Посылка
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostalShipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private ShipmentType type;
    private String recipientIndex;
    private String recipientAddress;
    private String recipientNae;
    @OneToMany(mappedBy = "shipment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ShipmentHistory> history = new ArrayList<>();

    public void addHistory(ShipmentHistory shipmentHistory){
        history.add(shipmentHistory);
        shipmentHistory.setShipment(this);
    }
}
