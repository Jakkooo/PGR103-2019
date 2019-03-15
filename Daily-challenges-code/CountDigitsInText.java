//Solution by Michael

import java.util.ArrayList;

public class CountDigitsInText {


        public static void main(String args[]){

            //create an array list that can store integers
            ArrayList<Integer> arrayList=new ArrayList<Integer>();

            String myText = "You have 2 beans and 2 apples. " +
                    "A bean costs 1 USD and an apple 2 USD. " +
                    "How much money would you get if you " +
                    "sell them?";


            for (char character : myText.toCharArray()) {
                if (Character.isDigit(character)==true) {
                    //make an int from the character and store it in the array
                    arrayList.add(Integer.parseInt(character+""));
                }
            }

            int sum = 0;

            for(int digit:arrayList){
                //run trough the digit array and sum it up
                System.out.println(digit);
                sum=sum+digit;
            }

            System.out.println("My sum is: "+sum);





            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(5);

            //displaying elements
            System.out.println(arrayList);

            //Adding "99" at the first position
            arrayList.add(0, 99);

            //displaying elements
            System.out.println(arrayList);

            //Iterate trough ArrayList
            for(int digit:arrayList){

                System.out.println(digit);

            }
            System.out.println();


            for (char character : myText.toCharArray()) {
                if (Character.isDigit(character)==true) {
                    System.out.println(character);
                }
            }


            myText = "Det var en gang en liten geitekilling som hadde lært å telle til 3. " +
                    "Da han kom til en vannpytt, stod han lenge og så på speilbildet sitt i " +
                    "vannet, og nå skal du høre hvordan det gikk: 1, sa geitekillingen. " +
                    "Dette hørte en kalv som gikk i nærheten og åt gras. – Hva gjør du for noe? sa kalven. " +
                    "Jeg teller meg, sa geitekillingen. – Skal jeg telle deg også? Hvis det ikke gjør vondt, " +
                    "så, sa kalven. Det gjør det vel ikke, stå stille, så skal jeg telle deg også? " +
                    "Nei, jeg tør ikke, kanskje jeg ikke får lov av mora mi engang, sa kalven og " +
                    "trakk seg unna. Men geitekillingen fulgte etter, og så sa han: Jeg er 1, og du er 2, 1-2. " +
                    "Mo-er! rautet kalven og begynte å gråte, og så kom mora til kalven, og det var selveste bjellekua " +
                    "på garden. Hva er det du rauter for? sa bjellekua. Geitekillingen teller meg! rautet kalven. " +
                    "Hva er det for noe? sa bjellekua. Jeg teller, sa geitekillingen. Jeg har lært å telle til 3, " +
                    "jeg gjør bare sånn: Jeg er 1, kalven 2, kua 3, 1-2-3. Å, nå telte han deg også! rautet kalven. " +
                    "Og da bjellekua skjønte det, ble den sint. Jeg skal lære deg å gjøre narr av kalven min og meg! " +
                    "Kom, kalven min, så tar vin’n.";


            for (char character : myText.toCharArray()) {
                if (Character.isDigit(character)==true) {
                    System.out.println(character);
                }
            }

        }
    }



