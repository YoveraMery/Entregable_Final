import java.util.ArrayList;

public class IdCustomers {

    ArrayList <IdCustomers> users = new ArrayList<>();
    String name, password;
    int dni, saldo;

    //Constructor
    public IdCustomers(String name, int dni, String password){
        this.name = name;
        this.password = password;
        this.dni = dni;

    }

    public void listCustomers(){
        IdCustomers users1 = new IdCustomers("Jack Ross", 40508689, "1234");
        IdCustomers users2 = new IdCustomers("Luke Howland", 80262498, "1235");
        IdCustomers users3 = new IdCustomers("Hasley Weigel", 40506251, "1236");
        IdCustomers users4 = new IdCustomers("Emma Watson", 75943619, "1237");
        IdCustomers users5 = new IdCustomers("Daniel Radcliffe", 61316110, "1238");

        users.add(users1);
        users.add(users2);
        users.add(users3);
        users.add(users4);
        users.add(users5);
    }

    public int validateInicio(int dni, String password){

        listCustomers();
        int cont=0;
        for (int i=0; i < 5; i++){
            if (users.get(i).dni==dni){
                for (int j = i; j==i; j++){
                    if(users.get(j).password.equals(password)){
                        cont=1;
                    }
                }
            }
        }
        return cont;
    }

    public String get_Name(int dni, String password){
        listCustomers();
        String name = null;

        for (int i =0; i < 5; i++){
            if (users.get(i).dni==dni){
                for (int j = i; j==i; j++){
                    if (users.get(j).password.equals(password)){
                        name= users.get(j).name;
                    }
                }
            }
        }
        return name;
    }

    public  int getSaldoInicial(int dni, String password){
        listCustomers();
        name = get_Name(dni, password);
        int saldo= 0;
        for (int i =0; i < 5; i++){
            if (users.get(i).name.equals(name)){
                saldo= users.get(i).saldo;

            }
        }
        return saldo;
    }
}
