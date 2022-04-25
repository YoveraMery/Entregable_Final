import java.util.Scanner;

public class Operaciones {
    public static double saldo, transaciones;


    public double getBalance(double balance1){
        saldo = balance1;
        return saldo;
    }

    int bandera= 0;
    int opcion= 0;

    Scanner lector = new Scanner(System.in);

    protected double retiro, deposito;

    public void ValidarMenu(String nombre){
        System.out.println("Welcome "+ nombre);
        do {
            do {
                System.out.println("...............................");
                System.out.println("Selecione una opción: ");
                System.out.println("    1) Déposito");
                System.out.println("    2) Retiro");
                System.out.println("    3) Consulte su saldo");
                System.out.println("    4) Salir");
                System.out.println("................................");
                opcion = lector.nextInt();

                if(opcion >=1 && opcion <=4){
                    bandera = 1;
                }else{
                    System.out.println("Opción inválida, intente de nuevo");
                    System.out.println("..................................");
                }
            }while (bandera == 0);
            if (opcion ==1){
                deposit();
            } else if(opcion == 2){
                withdrawals();
            }else if(opcion ==3){
                check();
            }else if(opcion == 4){
                System.out.println("Vuelva pronto");
                System.out.println("...............................");
                bandera = 2;
            }
        }while (bandera !=2);
    }

    //Depositar
    public void deposit(){
        System.out.println("Cantidad a depositar: ");
        deposito = lector.nextDouble();
        transaciones= saldo;
        saldo= transaciones + deposito;
        System.out.println("Depositó: "+deposito);
        System.out.println("Saldo actual: "+saldo);
    }
    //Retirar
    public void withdrawals(){
        System.out.println("Cantidad que va a retirar: ");
        retiro = lector.nextDouble();
        if(retiro <= saldo){
            transaciones = saldo;
            saldo = (transaciones - retiro);
            System.out.println("..........................");
            System.out.println("Retiraste: "+ retiro);
            System.out.println("Saldo actual: "+ saldo);
            System.out.println("............................");
        }else {
            System.out.println("...................");
            System.out.println("Saldo insuficiente :(");
        }
    }
    //Consultar saldo
    public void check(){
        System.out.println(".............................");
        System.out.println("Saldo: "+saldo);
    }
}
