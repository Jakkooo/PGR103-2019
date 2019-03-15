//Solution by red_baron

import java.util.*;

public class CountDigitsInText2 {


        public static void findDigits(String s){
            ArrayList<Integer> returnList=new ArrayList<Integer>();
            int sum=0;
            for(int i=0;i<s.length();i++){
                char currentChar=s.charAt(i);
                if(Character.isDigit((s.charAt(i)))){
                    returnList.add(Integer.parseInt(currentChar+""));
                    sum+=Integer.parseInt(currentChar+"");
                }
            }
            int j=0;
            System.out.println("Digits appering in text are:");
            for(int i:returnList){
                j++;
                if(j!=returnList.size())
                    System.out.print(i + ", ");
                else
                    System.out.println(i + ". ");
            }

            System.out.println("Sum of all digits is: " + sum);

        }

        public static void main(String args[]){
            String myText = "Det var en gang en liten geitekilling som hadde lært å telle til 3. " +
                    "Da han kom til en vannpytt, stod han lenge og så på speilbildet sitt i " +
                    "vannet, og nå skal du høre hvordan det gikk: 1, sa geitekillingen. " +
                    "Dette hørte en kalv som gikk i nærheten og åt gras. – Hva gjør du for noe? sa kalven. " +
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
            findDigits(myText);
        }
    }


