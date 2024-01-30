package app.itemcontrol.ItemControl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Location {
    private UUID idLocation;
    private String storeName;
    private long shelfNumber;
    private long rowNumber;
    private long maximumCapacity;
    private String description;
}