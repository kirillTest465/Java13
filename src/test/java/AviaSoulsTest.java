import org.junit.jupiter.api.Test;

class AviaSoulsTest {

    @Test
    public void sortFewTicketTest() {
        AviaSouls maneger = new AviaSouls();
        Ticket ticket1 = new Ticket("NN", "MSK", 3000, 15, 16);
        Ticket ticket2 = new Ticket("NN", "SPB", 5000, 12, 13);
        Ticket ticket3 = new Ticket("NN", "MSK", 2500, 10, 11);
        Ticket ticket4 = new Ticket("NN", "IST", 15000, 14, 19);
        Ticket ticket5 = new Ticket("NN", "MSK", 2700, 8, 11);
        Ticket ticket6 = new Ticket("NN", "KRD", 4000, 7, 10);
        Ticket ticket7 = new Ticket("MSK", "RND", 4500, 20, 22);
        Ticket ticket8 = new Ticket("MSK", "NSK", 6000, 11, 16);
        Ticket ticket9 = new Ticket("EKB", "NN", 2000, 9, 11);
        Ticket ticket10 = new Ticket("KZN", "MSK", 5000, 5, 7);
        Ticket ticket11 = new Ticket("KZN", "NN", 4200, 16, 17);
        Ticket ticket12 = new Ticket("NN", "MSK", 3100, 12, 13);
        Ticket ticket13 = new Ticket("NN", "MSK", 2800, 5, 7);


        maneger.add(ticket1);
        maneger.add(ticket2);
        maneger.add(ticket3);
        maneger.add(ticket4);
        maneger.add(ticket5);
        maneger.add(ticket6);
        maneger.add(ticket7);
        maneger.add(ticket8);
        maneger.add(ticket9);
        maneger.add(ticket10);
        maneger.add(ticket11);
        maneger.add(ticket12);
        maneger.add(ticket13);

        Ticket[] actual = maneger.search("NN", "MSK");
        Ticket[] expected = {ticket1, ticket3, ticket5, ticket12, ticket13};

    }

    @Test
    public void sortZeroTicketTest() {
        AviaSouls maneger = new AviaSouls();
        Ticket ticket1 = new Ticket("NN", "MSK", 3000, 15, 16);
        Ticket ticket2 = new Ticket("NN", "SPB", 5000, 12, 13);
        Ticket ticket3 = new Ticket("NN", "MSK", 2500, 10, 11);
        Ticket ticket4 = new Ticket("NN", "IST", 15000, 14, 19);
        Ticket ticket5 = new Ticket("NN", "MSK", 2700, 8, 11);
        Ticket ticket6 = new Ticket("NN", "KRD", 4000, 7, 10);
        Ticket ticket7 = new Ticket("MSK", "RND", 4500, 20, 22);
        Ticket ticket8 = new Ticket("MSK", "NSK", 6000, 11, 16);
        Ticket ticket9 = new Ticket("EKB", "NN", 2000, 9, 11);
        Ticket ticket10 = new Ticket("KZN", "MSK", 5000, 5, 7);
        Ticket ticket11 = new Ticket("KZN", "NN", 4200, 16, 17);
        Ticket ticket12 = new Ticket("NN", "MSK", 3100, 12, 13);
        Ticket ticket13 = new Ticket("NN", "MSK", 2800, 5, 7);


        maneger.add(ticket1);
        maneger.add(ticket2);
        maneger.add(ticket3);
        maneger.add(ticket4);
        maneger.add(ticket5);
        maneger.add(ticket6);
        maneger.add(ticket7);
        maneger.add(ticket8);
        maneger.add(ticket9);
        maneger.add(ticket10);
        maneger.add(ticket11);
        maneger.add(ticket12);
        maneger.add(ticket13);


        Ticket[] actual = maneger.search("NN", "EKB");
        Ticket[] expected = {};

    }

    @Test
    public void sortOneTicketTest() {
        AviaSouls maneger = new AviaSouls();
        Ticket ticket1 = new Ticket("NN", "MSK", 3000, 15, 16);
        Ticket ticket2 = new Ticket("NN", "SPB", 5000, 12, 13);
        Ticket ticket3 = new Ticket("NN", "MSK", 2500, 10, 11);
        Ticket ticket4 = new Ticket("NN", "IST", 15000, 14, 19);
        Ticket ticket5 = new Ticket("NN", "MSK", 2700, 8, 11);
        Ticket ticket6 = new Ticket("NN", "KRD", 4000, 7, 10);
        Ticket ticket7 = new Ticket("MSK", "RND", 4500, 20, 22);
        Ticket ticket8 = new Ticket("MSK", "NSK", 6000, 11, 16);
        Ticket ticket9 = new Ticket("EKB", "NN", 2000, 9, 11);
        Ticket ticket10 = new Ticket("KZN", "MSK", 5000, 5, 7);
        Ticket ticket11 = new Ticket("KZN", "NN", 4200, 16, 17);
        Ticket ticket12 = new Ticket("NN", "MSK", 3100, 12, 13);
        Ticket ticket13 = new Ticket("NN", "MSK", 2800, 5, 7);


        maneger.add(ticket1);
        maneger.add(ticket2);
        maneger.add(ticket3);
        maneger.add(ticket4);
        maneger.add(ticket5);
        maneger.add(ticket6);
        maneger.add(ticket7);
        maneger.add(ticket8);
        maneger.add(ticket9);
        maneger.add(ticket10);
        maneger.add(ticket11);
        maneger.add(ticket12);
        maneger.add(ticket13);

        Ticket[] actual = maneger.search("NN", "IST");
        Ticket[] expected = {ticket4};

    }
}