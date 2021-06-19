package com.example.eschatbot;
import com.example.eschatbot.responses.CustomerStateResponse;
import com.example.eschatbot.services.CustomerStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller{

    @Autowired
    private static CustomerStateService customerStateService;

    @GetMapping("/getCustomerState")
    public static CustomerStateResponse getCustomerStateController(@RequestParam String phoneNumber){
        return customerStateService.getCustomerState(phoneNumber);
    }
}
