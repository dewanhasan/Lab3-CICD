package ie.atu.userregistration;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;


@RestController
public class AnotherController {
    @PostMapping("users")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Credentials registerUserCredential(@RequestBody Credentials credentials){
        System.out.println("userName " +credentials.getUserName());
        System.out.println("password " +credentials.getPassword());
        return credentials;
    }
}
