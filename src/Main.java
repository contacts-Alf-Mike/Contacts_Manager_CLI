import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println("---------------------");
        System.out.println("1. View contacts. ");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit");
        System.out.println("Enter an option (1, 2, 3, 4, 5):");

    }
    public static void main(String[] args) {
        String directory = "data";
        String filename = "contacts.txt";

        try {
            Path dataDirectory = Paths.get(directory);
            Path dataFile = Paths.get(directory, filename);

            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

            List<String> dataText = new ArrayList<>();
            dataText.add("Name | Phone number");
            dataText.add("---------------------");
            dataText.add("Alfredo" + "\t|" + " 123456789");
            dataText.add("Michael" + "\t|" + " 123456789");
            dataText.add("Rocky" + "\t|" + " 123456789");
            dataText.add("Sharky" + "\t|" + " 123456789");
            dataText.add("Shelby" + "\t|" + " 123456789");
            dataText.add("Rufus" + "\t|" + " 123456789");

            if (Files.exists(dataFile)) {
                Files.write(dataFile, dataText);
//                Files.write(dataFile, Array.asList("Apollo"), StandardOpenOption.APPEND);
            }

        } catch (IOException iox){
            iox.printStackTrace();
        }


        int opt;
        Scanner sc = new Scanner(System.in);
        ArrayList<Manager> managerList = new ArrayList<Manager>();
//        menu();
        do{

        Manager m = new Manager();
        menu();
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                try {
                    List<String> fileData = Files.readAllLines(Paths.get("data", "contacts.txt"));

                    // New list to dump appropriate data.
                    List<String> newList = new ArrayList<>();
//
                    for (String name : fileData) {
                        newList.add(name);
                        System.out.println(name);
                    }

//            Files.write(Paths.get("data", "contacts.txt"), newList);
//            fileData = Files.readAllLines(Paths.get("data", "contacts.txt"));
//            for(String line: fileData){
//                System.out.println(line);
//            }

                }catch (IOException iox){
                    iox.printStackTrace();
                }
                break;
            case 2:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter New Contact Name");




                break;
            case 3:
                break;
            case 4:
                break;

        }

        }while (opt != 5);
//
//        String directory = "data";
//        String filename = "contacts.txt";
//
//        try {
//            Path dataDirectory = Paths.get(directory);
//            Path dataFile = Paths.get(directory, filename);
//
//            if (Files.notExists(dataDirectory)) {
//                Files.createDirectories(dataDirectory);
//            }
//
//            if (!Files.exists(dataFile)) {
//                Files.createFile(dataFile);
//            }
//
//            List<String> dataText = new ArrayList<>();
//            dataText.add("Name | Phone number");
//            dataText.add("Alfredo" + "\t|" + " 123456789");
//            dataText.add("Michael" + "\t|" + " 123456789");
//            dataText.add("Rocky" + "\t|" + " 123456789");
//            dataText.add("Sharky" + "\t|" + " 123456789");
//            dataText.add("Shelby" + "\t|" + " 123456789");
//            dataText.add("Rufus" + "\t|" + " 123456789");
//
//
//
//            if (Files.exists(dataFile)) {
//                Files.write(dataFile, dataText);
////                Files.write(dataFile, Array.asList("Apollo"), StandardOpenOption.APPEND);
//            }
//
//        } catch (IOException iox){
//            iox.printStackTrace();
//        }

        /* OUTPUT DATA */

//        try {
//            List<String> fileData = Files.readAllLines(Paths.get("data", "contacts.txt"));
//
//            // New list to dump appropriate data.
//            List<String> newList = new ArrayList<>();
////
//            for (String name : fileData) {
//               newList.add(name);
//                System.out.println(name);
//            }
//
////            Files.write(Paths.get("data", "contacts.txt"), newList);
////            fileData = Files.readAllLines(Paths.get("data", "contacts.txt"));
////            for(String line: fileData){
////                System.out.println(line);
////            }
//
//        }catch (IOException iox){
//            iox.printStackTrace();
//        }

//        menu();
    }
}