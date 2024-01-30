package app.itemcontrol.ItemControl.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class Product {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID idProduct;
    private String name;
    private String description;
    private String category;
    private long stockNumber;
    private double price;
    private long quantityAvailable;
    private long minimumAmountAllowed;
/*
    @OneToOne
    private Location locationInTheStore;
*/
    private LocalDateTime creationDate;
}