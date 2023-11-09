package deliveryfood.domain;

import deliveryfood.domain.*;
import deliveryfood.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private String userId;
    private String orderId;
    private Long price;
    private String payStatus;

    public PaymentApproved(PaymentHistory aggregate) {
        super(aggregate);
    }

    public PaymentApproved() {
        super();
    }
}
//>>> DDD / Domain Event
