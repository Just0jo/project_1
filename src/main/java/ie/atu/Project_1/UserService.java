package ie.atu.Project_1;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class UserService {
    public String ackMessage(User info)
    {
        String message = "correct details granted ";
        return  message;
    }



}
