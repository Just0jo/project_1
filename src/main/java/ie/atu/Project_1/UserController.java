package ie.atu.Project_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;
    private final CatalogServiceClient catalogServiceClient;
    private CatalogUser CatalogUser;

    @Autowired
    public UserController(UserService userService, CatalogServiceClient catalogServiceClient) {
        this.userService = userService;
        this.catalogServiceClient = catalogServiceClient;
    }

    @PostMapping("/details")
    public String details(@RequestBody User user) {
        String catalogDetails = catalogServiceClient.someDetails(User);
        String response = userService.ackMessage(user) + " " + catalogDetails;

        return response;
    }
}
