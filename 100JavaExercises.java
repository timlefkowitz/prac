import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        
        // Hash Function
        
//         function H(person):
//             hash := person.age
//             hash = hash + length(person.name)
//             if person.sex == "M":
//                 hash = hash + 1
//             return hash mod 6        
                

        // Even or Odd

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int x = number%2;

        if(x==0){
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }

        // Convert temperature in Degrees

        System.out.println("Enter temperature in Centigrade: ");
        Scanner sc = new Scanner(System.in);
        int c = Integer.parseInt(sc.nextLine());
        float f = ((9*c)/5)+32;

        System.out.println("Temperature in Fahrenheit is: "+f);




    }
}
