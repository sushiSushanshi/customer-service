package infosync.customer_service.service;

import infosync.customer_service.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer createCustomer(Customer customer);
    List<Customer> getAllCustomers();
}
