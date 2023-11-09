package deliveryfood.domain;

import deliveryfood.domain.*;
import deliveryfood.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String userId;
    private String foodname;
    private Integer qty;
    private String store;
    private Long price;
    private String orderId;
    private String address;
    private String status;
}
