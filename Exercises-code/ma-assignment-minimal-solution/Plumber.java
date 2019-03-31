//The Plumber class extends the Worker class which enables it to use the public attributes of the Worker class


public class Plumber extends Worker{ //#A

private double plumbingMaterials = 0;

//Constructor
public Plumber(String firstName, String lastName, Address address, int idNumber, double hoursWorked, double hourlyRate){
        super(firstName, lastName, address, idNumber, hoursWorked, hourlyRate); //#B
        }
//methods
public void setPlumbingCosts(double amount){
        plumbingMaterials = amount;
         }
@Override
public String doWork(){ //#C
        return "Install plumbing";
         }

@Override
public String toString() { //#D
        return "Plumber: "+super.toString() + "\n" + doWork();
        }

public double calculatePay(){ //#E
        return hoursWorked * hourlyRate + plumbingMaterials;
        }
}
