package by.sadovnick.postoffice.controller;

import by.sadovnick.postoffice.entity.PostalShipment;
import by.sadovnick.postoffice.service.PostalShipmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postal")
public class PostalShipmentController {

    private final PostalShipmentService postalShipmentService;

    public PostalShipmentController(PostalShipmentService postalShipmentService) {
        this.postalShipmentService = postalShipmentService;
    }

    @PostMapping("/register")
    public PostalShipment registerPostalShipment(@RequestBody PostalShipment postalShipment) {
        return postalShipmentService.registerShipment(postalShipment);
    }
}
