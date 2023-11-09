package deliveryfood.infra;

import deliveryfood.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "myPages", path = "myPages")
public interface MyPageRepository
    extends PagingAndSortingRepository<MyPage, Long> {
    List<MyPage> findByOrderId(String orderId);
}
