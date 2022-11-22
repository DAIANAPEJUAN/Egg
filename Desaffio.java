import java.util.*;

public class Desaffio {
    public static void main(String[] args) {
        Scanner miTeclado;
        miTeclado = new Scanner(System.in);
        //Declaro variables
        String usuario;
        int opServ;
        int clave;
        int claveCont = 1234;
        int opcion;
        double saldo = 60000;
        int contador = 1;
        long cbu;
        double monto = 0;
        double saldoActual = (saldo - monto);
  
  
  System.out.println("Por favor ingrese su nombre de usuario: ");
  usuario = miTeclado.nextLine();
  System.out.println("Ingrese su clave: ");
  clave = miTeclado.nextInt();

  while (contador <= 2) {
      contador = contador + 1;
      if (clave != claveCont){
          System.out.println("Clave incorrecta, intente nuevamente");
          clave = miTeclado.nextInt();
      }
  }
  if (usuario.equals("MANUELA") && clave == claveCont) {
      System.out.println("Acceso permitido");
      System.out.println("BIENVENIDO/A " + usuario);
      do {
          System.out.println("Seleccione una opcion:");
          System.out.println("1- CONSULTAR SALDO");
          System.out.println("2- TRANSFERENCIA");
          System.out.println("3- PAGO DE SERVICIO");
          System.out.println("4- DATOS DEL USUARIO");
          System.out.println("0- SALIR");
          opcion = miTeclado.nextInt();

          //Switch
          switch (opcion) {
              case 1:
                  System.out.println("Su saldo actual es de $ " + saldo);
                  System.out.println("..................................");
                  System.out.println("Seleccione una opcion:");
                  System.out.println("1- VOLVER AL MENU");
                  System.out.println("0- SALIR");
                  opcion = miTeclado.nextInt();
                  break;
              case 2:
                  System.out.println("Por favor, ingrese CBU");
                  cbu = miTeclado.nextLong();
                  System.out.println("Ingrese monto a transferir");
                  monto = miTeclado.nextDouble();
                  if (monto < saldo) {
                      System.out.println("La operacion ha sido exitosa");
                      System.out.println("................................");
                      System.out.println("Su saldo actual es $ " + (saldo - monto));
                      System.out.println("................................");
                      saldo = saldoActual;
                  }
                  if (monto > saldo) {
                      System.out.println("Fondos insuficientes para realizar la operacion");
                  }
                  System.out.println("Seleccione una opcion:");
                  System.out.println("1- VOLVER AL MENU");
                  System.out.println("0- SALIR");
                  opcion = miTeclado.nextInt();
                  break;
              case 3:
                  System.out.println("Seleccione el servicio a pagar");
                  System.out.println("1- TARJETA DE CREDITO TERMINADA EN 0022");
                  System.out.println("2- ECOGAS");
                  opServ = miTeclado.nextInt();
                  System.out.println("Ingrese el monto a pagar");
                  monto = miTeclado.nextDouble();
                  if (monto < saldo) {
                      System.out.println("La operación a sido exitosa");
                      System.out.println("..............................");
                      System.out.println("Su saldo actual es $ " + (saldo - monto));
                      System.out.println("..............................");
                      saldo = saldoActual;
                  }
                  if (monto > saldo) {
                      System.out.println("Fondos insuficietes para realizar la operación");
                  }
                  System.out.println("Seleccione una opcion:");
                  System.out.println("1- VOLVER AL MENU");
                  System.out.println("0- SALIR");
                  opcion = miTeclado.nextInt();
                  break;
              case 4:
                  System.out.println("GUERRA MANUELA");
                  System.out.println("CUIT: 0023347652343");
                  System.out.println("CBU: 0128444990002284753020");
                  System.out.println("Alias: ETER.FRIO.MUSA");
                   System.out.println(".............................");
                  System.out.println("Seleccione una opcion:");
                  System.out.println("1- VOLVER AL MENU");
                  System.out.println("0- SALIR");
                  opcion = miTeclado.nextInt();
                  break;
              default:
                   System.out.println("Opción inválida"); 
                   break;
  
          }
       
      } while (opcion != 0);
  } else {
      System.out.println("Usuario y/o clave incorrecto, acceso denegado");
  }

  System.out.println("Gracias por utilizar nuestros servicios");
}
}
