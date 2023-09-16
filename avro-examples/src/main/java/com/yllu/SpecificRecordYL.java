package com.yllu;

import com.example.Customer;

public class SpecificRecordYL {

    public static void main(String[] args) {
        Customer.Builder customerBuilder = Customer.newBuilder();
        Customer customer = customerBuilder
                .setFirstName("John")
                .setAge(23)
                .setLastName("Snow")
                .setHeight(183f)
                .setWeight(80f)
                .setAutomatedEmail(false).build();

        System.out.println(customer);
    }
}
