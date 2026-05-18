package com.vietanh.restaurantmangement.signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vietanh.restaurantmangement.customer.Customer;
import com.vietanh.restaurantmangement.customer.CustomerService;

@RestController
@RequestMapping("/signin")
public class SignInController {
    @Autowired
    private CustomerService customerService;

    @PostMapping()
    public ResponseEntity<GetMessage> checkSignIn(@RequestBody SignIn signIn) {
        GetMessage msg = new GetMessage();
        Boolean checkUserName = customerService.checkCustomerByUserName(signIn.getUserName());
        ResponseEntity<GetMessage> response;
        if (!checkUserName) {
            msg.setStatus(404);
            msg.setMsg("Not found username " + signIn.getUserName());
            return ResponseEntity.notFound().build();
        } else {
            Customer customer = customerService.findCustomerByUserName(signIn.getUserName());
            Boolean checkPassWord = new SignIn().vadidationPassWord(signIn.getPassWord(), customer.getPassWord());
            if (!checkPassWord) {
                msg.setStatus(400);
                msg.setMsg("Password not correct");
                return ResponseEntity.badRequest().body(msg);
            } else {
                msg.setStatus(200);
                msg.setMsg("Log in Successfully");
                response = ResponseEntity.ok(msg);
            }
        }
        return response;
    }
}