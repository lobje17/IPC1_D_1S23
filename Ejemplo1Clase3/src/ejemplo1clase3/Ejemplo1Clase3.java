/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1clase3;
import java.util.Scanner;

/**
 *
 * @author lobje
 */
public class Ejemplo1Clase3 {

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
        Columna 3 = Promedio
    */
    public static String [][] estudiantes = new String[10][4];
    public static String [][] notas = new String[10][5];
    public static int idEstudiantes = 0;
    public static int idNotas = 0;
    public static Scanner entrda = new Scanner(System.in);
    public static String opcion = "";
    public static String salir = "10";
    
    public static void main(String[] args) {
        // TODO code application logic here
        while (!opcion.equals(salir)) {
            ListaOpciones();
            Menu();
        }
    }
    
    /*Menu principal*/
    public static void ListaOpciones()
    {
        Mensaje("*************************************");
        Mensaje("Bienvenido al sistema");
        Mensaje("Puede realizar las siguientes opciones");
        Mensaje("1. Nuevo estudiate");
        Mensaje("2. Actiualizar datos");
        Mensaje("3. Mostrar listado");
        Mensaje("4. Agregar notas a estudiates");
        Mensaje("5. Calcular promedio");
        Mensaje("6. Ordenar listado");
        Mensaje("10. Salir");
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
            case "4":
                String opcionTmp = opcion;
                RegistrarNotas();
                opcion = opcionTmp;
                break;
            case "5":
                CalcularPromedioEstudiates();
                break;
            case "6":
                OrdenarListado();
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
            estudiantes[idEstudiantes][3] = "0";  // PROMEDIO
            IngresarNotasCero();
            idEstudiantes++;
        }
        else
        {
            Mensaje("Ya esta registrado un estudiante con el nombre "+nombre);
        }
    }
    
    public static void IngresarNotasCero()
    {
        for (int i = 0; i < 5; i++) {
            notas[idEstudiantes][i] = "0";
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
                System.out.print("  Edad: " + estudiantes[i][2]);
                Mensaje("  Promedio: "+estudiantes[i][3]);
            }
        }
    }
    
    /*Menu para notas*/
    public static void RegistrarNotas()
    {
        do {            
            ListaOpcionesAgregarNotas();
            MenuAgregarNotas();
        }while (!opcion.equals("3"));
    }
    
    public static void ListaOpcionesAgregarNotas()
    {        
        Mensaje("*************************************");
        Mensaje("Bienvenido al sistema de registro de notas");
        Mensaje("*************************************");
        Mensaje("Puede realizar las siguientes opciones");
        Mensaje("1. Agregar notas");
        Mensaje("2. Ver notas");
        Mensaje("3. Salir al menu principal");
        Mensaje("");
        opcion = ObtenerDato("Ingresar el numero de la opcion");
        
        Mensaje("*************************************");
    }
    
    public static void MenuAgregarNotas()
    {
        switch (opcion) {
            case "1":
                IngresarNotas();
                break;
            case "2":
                VerNotasRegistradas();
                break;
            default:
                Mensaje("Saliendo del sistema de registro de notas");
        }
    }
    
    public static void IngresarNotas()
    {
        String nota = "";
        int i = 0;
        if(idNotas<idEstudiantes)
        {
            while(i<5) {
                nota = ObtenerDato("Ingresar la nota No. "+(i+1));
                if(nota!=null)
                {
                    notas[idNotas][i] = nota;
                    i++;
                }
                else
                {
                    Mensaje("Ingrese un correcto que se encuentre entre 0 y 100");
                }
            }
            idNotas++;
        }
        else
        {
            Mensaje("Ya no hay mas estudiates registrados");
        }        
    }
    
    public static void VerNotasRegistradas()
    {                       
        Mensaje("Listados de notas");
        // 10
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i][0]!=null)
            {
                Mensaje("Nombre: " + estudiantes[i][0]);
                for (int j = 0; j < 5; j++) {
                    if(notas[i][j]!=null)
                    {
                       System.out.print(notas[i][j] + " - "); 
                    }
                    else
                    {
                       System.out.print("0 - "); 
                    }
                }
                Mensaje("");
                //Mensaje("  Promedio: "+estudiantes[i][3]);
            }
        }
    }  
    
    /*Calculo de Promedios*/
    public static void CalcularPromedioEstudiates()
    {
        Mensaje("***************************");
        Mensaje("Calculando promedio......");
        for (int i = 0; i < idEstudiantes; i++) {
            estudiantes[i][3] = CalcularPromedio(i);
        }
        Mensaje("***************************");
    }
    
    public static String CalcularPromedio(int indiceEstudiante)
    {
        int promedio = 0;
        for (int i = 0; i < 5; i++) {
            // promedio = promedio + 
            promedio += Integer.parseInt(notas[indiceEstudiante][i]);
        }
        
        return String.valueOf(promedio/5);
    }
    
    /*Ordenar Estudiantes de acuerdo a su promedio*/
    public static void OrdenarListado()
    {
        String nombre = "";
        String carnet = "";
        String edad = "";
        String promedio = "";
        /*
            10 5 9 15 100
            10
            10 < 5
            10 < 9
            10 < 15
            15 5 9 10 100
            15 < 100
            100 5 9 10 15
            100 9 5 10 15
            100 10 5 9 15
            100 15 5 9 10
        */
        
        int notaActual = 0;
        int notaSiguiente = 0;
        
        for (int i = 0; i < idEstudiantes-1; i++) {
            notaActual = Integer.parseInt(estudiantes[i][3]);
            for (int j = i + 1; j < idEstudiantes; j++) {
                notaSiguiente = Integer.parseInt(estudiantes[j][3]);
                if(notaActual<notaSiguiente)
                {
                    nombre = estudiantes[i][0];
                    carnet = estudiantes[i][1];
                    edad = estudiantes[i][2];
                    promedio = estudiantes[i][3];
                    
                    estudiantes[i][0] = estudiantes[j][0];
                    estudiantes[i][1] = estudiantes[j][1];
                    estudiantes[i][2] = estudiantes[j][2];
                    estudiantes[i][3] = estudiantes[j][3];
                    
                    estudiantes[j][0] = nombre;
                    estudiantes[j][1] = carnet;
                    estudiantes[j][2] = edad;
                    estudiantes[j][3] = promedio;
                    
                    notaActual = notaSiguiente;
                }
            }
        }
    }
    
    /**/
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
