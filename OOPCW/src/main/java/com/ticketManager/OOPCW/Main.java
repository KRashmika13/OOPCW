package com.ticketManager.OOPCW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Real-Time Event Ticketing System");

        System.out.println("Please enter the total number of tickets(): ");
        int totalTickets = scan.nextInt();

        System.out.print("Please enter ticket release rate for vendor(): ");
        int ticketReleaseRate = scan.nextInt();

        System.out.println("Enter the customer retrieval rate: ");
        int customerRetrievalRate = scan.nextInt();

        System.out.print("Enter maximum ticket capacity ");
        int maximumTicketCapacity = scan.nextInt();

        //instantiate a configuration object
        Configuration configuration = new Configuration(totalTickets, ticketReleaseRate, customerRetrievalRate, maximumTicketCapacity);
    }
}
