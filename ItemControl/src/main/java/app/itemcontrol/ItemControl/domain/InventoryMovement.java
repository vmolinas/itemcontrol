package app.itemcontrol.ItemControl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class InventoryMovement {
    private UUID idMovement;
    private Product idRelatedProduct;
    private String movementType;
    private  long amount;
    private LocalDateTime dateTime;
    private Location originDestiny;
    private String comment;
}