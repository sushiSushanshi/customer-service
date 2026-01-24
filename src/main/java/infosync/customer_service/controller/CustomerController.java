package infosync.customer_service.controller;

import infosync.customer_service.entity.Customer;
import infosync.customer_service.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/customer")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createCustomer(@RequestBody Customer customer){
        Customer createdCustomer = customerService.createCustomer(customer);
        return ResponseEntity.ok("customer account successfully created with id: "+createdCustomer.getId());
    }

    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

}
