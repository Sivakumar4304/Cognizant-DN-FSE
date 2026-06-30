//high level classes should not depend on low level classes.both depends on abstractions.
interface CustomerRepository {
    public void findCustomerById();
}

class CustomerRepositoryImp implements CustomerRepository {
    int id;

    CustomerRepositoryImp(int id) {
        this.id = id;
    }

    public void findCustomerById() {
        System.out.println("Customer Id : " + id);
    }

}

class CustomerService {
    CustomerRepository customerRepository;

    CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    void display() {
        customerRepository.findCustomerById();
        System.out.println("Accroding to customer ID :");
        System.out.println("Customer name is siva kumar and his account is in active.");
        System.out.println("Thankyou and visit Again.");
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) {

        CustomerRepositoryImp cs1 = new CustomerRepositoryImp(16);

        CustomerService cs2 = new CustomerService(cs1);
        cs2.display();

    }
}
