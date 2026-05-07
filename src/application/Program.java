package application;

import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    static void main() {

        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(1, "Rick", "rick@gmail.com", LocalDate.of(2005, 4, 14), 2500.0, new Department(1, "Books"));
        System.out.println(seller);
    }
}
