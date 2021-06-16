package com.company;
public class Main {
    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("123", "Bengaluru",
                "Mumbai", "DepartureDateTime", "ArrivalDateTime",
                "3D", 8000, false, null, null, "lunch");
        Ticket touristTicket = new TouristTicket("38490", "India", "Dubai", "DepartureDateTime", "ArrivalDateTIme", "10A", 15000, false, null, null, "Dubai Hotel", new String[]{""});
        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}