package GroupProject1;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        String[] countries= {"Canada","India","US","France","China","Brazil","Austria","Germany","Cuba"};
        String[] capitals= {"Otawa","Delhi","Washington","Paris","Beijing","Brasilia","Berlin","Havana"};
        String cap=null;
        boolean ismatch=true;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of countries you want to store: ");
        //reading the number of elements
        int	n=sc.nextInt();
        //creates an array in the memory of length specified by user
        String[] array = new String[n];
        System.out.println("Enter the countries ");
        for(int i=0; i<n; i++)
        {
            //reading array elements from the user
            array[i]=sc.next();

        }

        System.out.println("~~~~~~~~~~~~OUTPUT~~~~~~~~~~~~~~~~~");
        for(int j=0;j<array.length;j++)
        {
            for(int i=0;i<countries.length;i++)
            {
                if(array[j].equalsIgnoreCase(countries[i]))
                {
                    cap=capitals[i];
                    System.out.println("Capital of "+countries[i]+" is equal to :=" +cap);

                    System.out.println();
                    break;


                }
                else if(i==(countries.length-1))
                {
                    System.out.println("Capital of "+array[j]+" is unknown.Sorryyyyyyyyyyyy");
                }




            }

        }







    }

}
