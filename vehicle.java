   import java.util.Scanner;
   public class Vehiclemanagement {
      int num; int dop; String name; int  vehiclenum; String Address; int citizenship; int license; int Id; String vehiclename; String vehicleModel;
   
      public void storeData(){
         
       Scanner input = new Scanner(System.in);
       System.out.println("Enter how many data you want to save:  ");
       num = input.nextInt();
       int i;
       for( i=1; i<=num; i++){
           System.out.println("Entering "+ i + " Vehicle");
           System.out.println("Enter Owner name: ");
           name = input.next();
           System.out.println("Enter Citizenship number: ");
           citizenship = input.nextInt();
           System.out.println("Enter Vehicle number: ");
           vehiclenum = input.nextInt();
           System.out.println("Enter Date of purchase: ");
           dop = input.nextInt();
           System.out.println("Enter Owner Address: ");
           Address = input.next();
           System.out.println("Enter license no.: ");
           license = input.nextInt();
           System.out.println("Enter Vehicle Name: ");
           vehiclename = input.next();
           System.out.println("Enter Vehicle Model: ");
           vehicleModel = input.next();
           System.out.println("----------------------------------");
           System.out.println("----------------------------------");
       }
       System.out.println("-----------DATA SAVED------------");
   
       System.out.println("Enter the vehicle Number: ");
            Id = input.nextInt();
            //Vehiclemanagement objenter = new Vehiclemanagement();
            
    }
                

        public void displayData(){
           
               if(Id ==  num){
            System.out.println("Owner Name: " + name);
            System.out.println("Owner Address: " + Address);
            System.out.println("CitizenShip: " + citizenship);
            System.out.println("Date of purchase: " + dop);
            System.out.println("Vehicle Number: " + vehiclenum);
            System.out.println("license Number: " + license);
               }
               else{
                   System.out.println("-------------Error-------------");
               }
        }

     public static void main(String[] args) {
      
        Vehiclemanagement objdisplay = new Vehiclemanagement();
        
        objdisplay.storeData();
        objdisplay.displayData();
    } 
     
     
    
}
