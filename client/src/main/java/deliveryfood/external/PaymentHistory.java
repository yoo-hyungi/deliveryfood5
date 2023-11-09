package deliveryfood.external;

import java.util.Date;
import lombok.Data;

@Data
public class PaymentHistory {

    private Long id;
    private String userId;
    private String orderId;
    private Long price;
    private String payStatus;
}
