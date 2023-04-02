package src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в следующем порядке: Фамилия Имя Отчество дата_рождения номер_телефона пол");

        String input = scanner.nextLine().trim();

        String[] data = input.split("\\s+");

        // check count of data
        int count = data.length;
        if(count != 6){
            System.out.println("Error: Invalid data count!");
            System.out.println("Usage: Фамилия Имя Отчество дата_рождения номер_телефона пол");
            System.exit(1);
        }

        String firstName = data[1];
        String lastName = data[0];
        String middleName = data[2];
        String dateOfBirthStr = data[3];
        String phoneNumberStr = data[4];
        String genderStr = data[5];

        // parse date of birth
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateOfBirth = null;
        try {
            dateOfBirth = LocalDate.parse(dateOfBirthStr, formatter);
        } catch (Exception e) {
            System.out.println("Error: Invalid date format!");
            System.exit(1);
        }

        // parse phone number
        long phoneNumber = 0;
        try {
            phoneNumber = Long.parseLong(phoneNumberStr);
        } catch (Exception e) {
            System.out.println("Error: Invalid phone number format!");
            System.exit(1);
        }

        // parse gender
        char gender = genderStr.charAt(0);
        if (!(gender == 'm' || gender == 'f')) {
            System.out.println("Error: Invalid gender format!");
            System.exit(1);
        }

        // create filename and file
        String fileName = String.format("%s.txt", lastName);
        BufferedWriter writer = null;

        // append data to file
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(String.format("%s %s %s %s %d %c", firstName, lastName, middleName, dateOfBirth.format(formatter), phoneNumber, gender));
            writer.write(System.getProperty("line.separator")); // add new line separator
            System.out.println("Data saved successfully to file!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
