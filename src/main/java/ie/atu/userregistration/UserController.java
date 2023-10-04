package ie.atu.userregistration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @Autowired
    private UserService us;

    @GetMapping("/registerUser/{name}/{email}")
    public String getUSer(@PathVariable String name, @PathVariable String email){
        return us.registerUser(name, email);
    }


}
