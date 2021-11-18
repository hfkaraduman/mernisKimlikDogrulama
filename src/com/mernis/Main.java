package com.mernis;

import adapters.concretes.MernisServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.NeroCustomerManager;
import entities.concretes.Customer;

public class Main {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
        customerManager.Save(new Customer(
                1,
                "Hasan Feyzi",
                "Karaduman",
                "1993",
                "53833204176"
        ));

    }
}
