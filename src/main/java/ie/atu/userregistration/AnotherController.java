package ie.atu.userregistration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.sql.SQLOutput;

public class AnotherController {
    @PostMapping("user")
    @ResponseStatus(HttpStatus.CREATED)
    public Credentials registerUserCredential(@RequestBody Credentials credentials){
        System.out.println("User ID: " + credentials.getUserName());
        System.out.println("User ID: " + credentials.getPassword());
        return credentials;
    }
}
