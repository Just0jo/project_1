package ie.atu.Project_1;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "catalog-service", url = "http://localhost:8083")
public interface CatalogServiceClient {

    @PostMapping("/catalog")
    String someDetails(@RequestBody User user);
}
