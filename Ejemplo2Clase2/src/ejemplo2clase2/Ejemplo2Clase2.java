/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2clase2;
import java.util.Scanner;

/**
 *
 * @author lobje
 */
public class Ejemplo2Clase2 {

    /**
     * @param args the command line arguments
     */
    
    /*
        - Ingresar nuevos estudiantes
        - Actualizar los del estudiante
        - Mostrar el listado de los estudiantes
    */
    /*
        Fila = representar el conjunto de datos de un estudiante
        Columna = representa el dato de un estudiate
        Columna 0 = nombre
        Columna 1 = carnet
        Columna 2 = edad
    */
    public static String [][] estudiantes = new String[1][3];
    public static int idEstudiantes = 0;
    public static Scanner entrda = new Scanner(System.in);
    public static String opcion = "";
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        while (!opcion.equals("4")) {
            ListaOpciones();
            Menu();
        }
    }
    
    public static void ListaOpciones()
    {
        Mensaje("*************************************");
        Mensaje("Bienvenido al sistema");
        Mensaje("Puede realizar las siguientes opciones");
        Mensaje("1. Nuevo estudiate");
        Mensaje("2. Actiualizar datos");
        Mensaje("3. Mostrar listado");
        Mensaje("4. Salir");
        Mensaje("");
        opcion = ObtenerDato("Ingresar el numero de la opcion");
        
        Mensaje("*************************************");
    }
    
    public static void Menu()
    {
        switch (opcion) {
            case "1":
                RegistrarEstudiante();
                break;
            case "2":
                ActualizarDatosEstudiante();
                break;
            case "3":
                VerListado();
                break;
            default:
                Mensaje("Saliendo del programa");
        }
    }
    
    public static void RegistrarEstudiante()
    {
        Mensaje("Registro de estudiante");
               // 0, 1        // 1
        if(idEstudiantes<estudiantes.length)
        {
            Mensaje("Ingrese los datos del estudiante");
            String nombre = ObtenerDato("Ingrese el nombre");
            String carnet = ObtenerDato("Ingrese el numero de carnet");
            String edad = ObtenerDato("Ingrese la edad");
            
            AgregarDatos(nombre, carnet, edad);
        }
        else
        {
            Mensaje("Se a alcanzado el limite de estudiates");
        }
    }
    
    public static void AgregarDatos(String nombre, String carnet, String edad)
    {
        if(ExisteEstudiante(nombre)==-1)
        {
            estudiantes[idEstudiantes][0] = nombre;
            estudiantes[idEstudiantes][1] = carnet;
            estudiantes[idEstudiantes][2] = edad;
            
            idEstudiantes++;
        }
        else
        {
            Mensaje("Ya esta registrado un estudiante con el nombre "+nombre);
        }
    }
    
    public static int ExisteEstudiante(String nombre)
    {
        for (int i = 0; i < estudiantes.length; i++) {
            
            if(estudiantes[i][0]!=null)
            {
                if(estudiantes[i][0].equals(nombre))
                {
                    return i;
                }
            }
            else
            {
                return -1;
            }
        }
        return -1;
    }
    
    public static void ActualizarDatosEstudiante()
    {
        Mensaje("");
        Mensaje("Actualizar datos del estudiante");
        String nombre = ObtenerDato("Ingrese el nombre");
        
        int posicioEstudiante = ExisteEstudiante(nombre);
        
        if(posicioEstudiante!=-1)
        {
            String carnet = ObtenerDato("Ingrese el numero de carnet");
            String edad = ObtenerDato("Ingrese la edad");
            
            estudiantes[posicioEstudiante][1] = carnet;
            estudiantes[posicioEstudiante][2] = edad;
            
            Mensaje("Datos actualizados\n");
        }
        else
        {
            Mensaje("No existe un estudiate con el nombre "+nombre);
        }
    }
    
    public static void VerListado()
    {                       
        Mensaje("Listados de estudiantes registrados");
        // 10
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i][0]!=null)
            {
                System.out.print("Nombre: " + estudiantes[i][0]);
                System.out.print("  Carnet: " + estudiantes[i][1]);
                Mensaje("  Edad: "+estudiantes[i][2]);
            }
        }
    }
    
    public static String ObtenerDato(String msj)
    {
        Mensaje(msj);
        return entrda.nextLine();
    }
    
    public static void Mensaje(String msj)
    {
        System.out.println(msj);
    }
}
