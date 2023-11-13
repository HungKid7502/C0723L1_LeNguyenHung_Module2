package service.impl;

import model.Customer;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import javax.swing.*;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public Customer[] getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public void edit(int idEdit, Customer customer) {
        customerRepository.edit(idEdit, customer);
    }
}