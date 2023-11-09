package deliveryfood.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "MyPage_table")
@Data
public class MyPage {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String userId;
    private String foodname;
    private String status;
    private Integer qty;
    private Long price;
    private String store;
    private String orderId;
    private String address;
}
