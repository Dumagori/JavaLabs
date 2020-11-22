package laba6;

import laba6.controller.WriteController;
import laba6.controller.ReadController;

import java.util.Scanner;

public class JavaToMySql {
    public void StartConnection() throws ClassNotFoundException {
        while (true){
            System.out.println("What do you want to do? [1 - read from base; 2 - write to base]: ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            switch (choose){
                case 1:
                    ReadController readController = new ReadController();
                    break;
                case 2:
                    WriteController writeController = new WriteController();
                    break;
            }
        }
    }
}

