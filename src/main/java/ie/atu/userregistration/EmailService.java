package ie.atu.userregistration;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public String sendEmail(String name, String email){
        return "Welcome to User Registration, Name: " + name +  " Email: " + email;
    }
}
