import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {

    public int getDNI(){
        int dni;
        String idni;
        Scanner lector = new Scanner(System.in);
        while (true){
            try{
                System.out.println("DNI: ");
                dni = lector.nextInt();
                idni= String.valueOf(dni);
                while (idni.length() !=8){
                    System.out.println("Debe ingresar solo 8 dígitos");
                    System.out.println("DNI: ");
                    dni= lector.nextInt();
                    idni= String.valueOf(dni);
                }break;
            }catch (InputMismatchException ex){
                System.out.println("Debe ingresar solo 8 dígitos");
                lector.next();
            }
        }


        return dni;
    }

    public String requestPassword(){
        String password = "";
        Console csl;

        if ((csl = System.console())!= null){
            char [] pass = csl.readPassword("Password: ");
            password = String.valueOf(pass);
        }

        //Cifrar la contraseña
        for (int i = 0; i < password.length(); i++){
            if (password != null)
                System.out.print("*");
        }
        System.out.println();
        return password;
    }


}
