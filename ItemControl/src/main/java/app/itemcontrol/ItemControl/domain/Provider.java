package app.itemcontrol.ItemControl.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Provider {
    private UUID idProvider;
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;
    private String transactionHistory;
}