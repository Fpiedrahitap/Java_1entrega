import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createEntities();
    }

    public static void createEntities() {

        System.out.println("Empresa Id: ");
        int empresaId = sc.nextInt();
        sc.nextLine();
        System.out.println("Empresa Name: ");
        String empresaName = sc.nextLine();
        Empresa empresa = new Empresa(empresaId, empresaName);

        System.out.println("Empleado Name: ");
        String empleadoName = sc.nextLine();
        System.out.println("Empleado Salario: ");
        double empleadoSalary = sc.nextDouble();
        sc.nextLine();
        Empleado empleado = new Empleado(empleadoName, empleadoSalary);

        System.out.println("Nomina Empleado: ");
        String nominaEmpleado = sc.nextLine();
        System.out.println("Nomina Monto de pago: ");
        double nominaMonto = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nomina Fecha de pago: ");
        String nominaFecha = sc.nextLine();
        Nomina nomina = new Nomina(nominaEmpleado, nominaMonto, nominaFecha);

        System.out.println("Cliente Nombre: ");
        String clienteNombre = sc.nextLine();
        System.out.println("Cliente Apellido: ");
        String clienteApellido = sc.nextLine();
        System.out.println("Cliente Direccion: ");
        String clienteDireccion = sc.nextLine();
        System.out.println("Cliente Telefono: ");
        String clienteTelefono = sc.nextLine();
        System.out.println("Cliente Correo: ");
        String clienteCorreo = sc.nextLine();
        Cliente cliente = new Cliente(clienteNombre, clienteApellido, clienteDireccion, clienteTelefono, clienteCorreo);

        System.out.println("Registro Cliente: ");
        String registroCliente = sc.nextLine();
        System.out.println("Registro Fecha de Registro: ");
        String registroFecha = sc.nextLine();
        Registro registro = new Registro(registroCliente, registroFecha);

        System.out.println("Empresa: " + empresa.getId() + ", " + empresa.getName());
        System.out.println("Empleado: " + empleado.getName() + ", " + empleado.getSalary());
        System.out.println("Nomina: " + nomina.getEmpleado() + ", " + nomina.getMontoDePago() + ", " + nomina.getFechaDePago());
        System.out.println("Cliente: " + cliente.nombre + ", " + cliente.apellido + ", " + cliente.direccion + ", " + cliente.telefono + ", " + cliente.correo);
        System.out.println("Registro: " + registro.cliente + ", " + registro.fechaDeRegistro);
    }
}