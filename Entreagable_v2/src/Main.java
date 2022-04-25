public class Main {

    public static void main(String[] args) {
        //Clase Cliente
        Cliente customer = new Cliente();

        //Llamo a mis métodos de la clase Cliente
        int dni = customer.getDNI();
        String password = customer.requestPassword();
        String name = "";
        int saldo = 0;

        //Clase IdCustomers
        IdCustomers validar = new IdCustomers(name, dni, password);

        //LLamo métodos
        int verificar = validar.validateInicio(dni, password);

        if (verificar == 1) {
            name = validar.get_Name(dni, password);
            saldo = validar.getSaldoInicial(dni, password);
            //clase operaciones
            Operaciones operacion = new Operaciones();
            //Llamo a mis métodos
            operacion.getBalance(0);
            operacion.ValidarMenu(name);
        }
        int cont = 1; //Mi contador
        while (verificar != 1 && cont < 3) {
            System.out.println("Información Errónea");
            System.out.println("Pruebe otra vez");

            dni = customer.getDNI();
            password = customer.requestPassword();
            name = "";
            validar = new IdCustomers(name, dni, password);
            verificar = validar.validateInicio(dni, password);

            if (verificar == 1) {
                name = validar.get_Name(dni, password);
                Operaciones operacion = new Operaciones();
                operacion.getBalance(0);
                operacion.ValidarMenu(name);
            }
            cont++;
            if (cont == 3) {
                System.out.println("Alcanzo, el límite de intentos");
            }
        }
    }
}
