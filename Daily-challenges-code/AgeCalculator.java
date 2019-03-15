//example who to use java time to calculate the age and age difference

import java.time.LocalDate;
import java.time.Period;


public class AgeCalculator {

    static public int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        // Calculates the date difference using the period
        return Period.between(birthDate, currentDate).getYears();
    }


    static public void whoIsOlder(String person1, int years1, String person2, int years2) {
        //Find out who is older
        if(years1>years2)
            System.out.println(person1+" is older than "+person2);
        else if(years2>years1)
            System.out.println(person2+" is older than "+person1);
        else System.out.println(person2+" and "+person1 + " are the same age.");
    }


    public static void main(String[] args) {

        //setting the age
        LocalDate birthDate = LocalDate.of(1984, 9, 18);
        //getting the current age
        LocalDate currentDate = LocalDate.now();
        //Get the age of a person using java time
        System.out.println("You are "+calculateAge(birthDate,currentDate)+" years old.");
        //Check who is older
        whoIsOlder("Michael", calculateAge(birthDate,currentDate),"Olav", calculateAge(birthDate,currentDate));


    }


}