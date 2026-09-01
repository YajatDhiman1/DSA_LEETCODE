import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        String id = s1.nextLine();

        int at = -1;
        int dot = -1;

        for(int i = 0; i < id.length(); i++){
            if(id.charAt(i) == '@'){
                at = i;
            }
            else if(id.charAt(i) == '.'){
                dot = i;
            }
        }

        if(at == -1 || dot == -1){
            System.out.println("Invalid");
        }
        else if(dot > at){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}