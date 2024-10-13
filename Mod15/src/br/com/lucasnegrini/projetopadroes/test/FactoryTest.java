package br.com.lucasnegrini.projetopadroes.test;

import br.com.lucasnegrini.projetopadroes.domain.*;

public class FactoryTest {
    public static void main(String[] args) {
        Customer customer = new Customer("B", false);
        Factory factory = getFactory(customer);
        Car car = factory.create(customer.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer customer) {
        if (customer.hasCompanyContract()){
            return new ContractFactory();
        }else {
            return new NoContractFactory();
        }
    }
}
