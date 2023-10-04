package ie.atu.userregistration;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private EmailService emailService;
    @Autowired
    public UserService(EmailService emailService){
        this.emailService = emailService;
    }

    public String registerUser(String name, String email){
        return  emailService.sendEmail(name, email);
    }




}
