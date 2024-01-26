package lab2p2_gerardohasbum;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Lab2P2_GerardoHasbum {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Libros> Libros = new ArrayList();
        ArrayList<Articulos> Articulos = new ArrayList();
        ArrayList<Cursos> Cursos = new ArrayList();
        ArrayList<Conferencias> Conferencias = new ArrayList();
        ArrayList<Usuarios> Usuarios = new ArrayList();

        Usuarios.add(new Usuarios("stud", "123", "est"));//Usuarios de prueba
        Usuarios.add(new Usuarios("prof", "456", "tch"));
        Usuarios.add(new Usuarios("admin", "789", "bib"));

        Libros.add(new Libros("Harry Potter and the Goblet of Fire", "J.K. Rowling", "Magia", "2000", 's'));
        Articulos.add(new Articulos("Aprecio Familiar", "Discord", "Violencia Intrafamiliar", "solo dios sabe", 's'));
        Cursos.add(new Cursos("Si existo", "Dios", 200, "Youtube"));
        Conferencias.add(new Conferencias("QUE SI EXISTO", "Dios", "1/26/2024", 2, "googlemeets.com/si"));

        char res_us = 's';

        while (res_us == 's' || res_us == 'S') {//comienzo while #1
            System.out.println("Inicio de Sesion");
            System.out.println("Ingrese su Usuario");
            String usuario = sc.next();
            System.out.println("Ingrese su Password");
            String password = sc.next();
            boolean us_ver = false;
            boolean pass_ver = false;

            for (int i = 0; i < Usuarios.size(); i++) {
                Usuarios temp = Usuarios.get(i);
                if (Usuarios.get(i).getNom().equals(usuario)) {
                    us_ver = true;
                }
            }
            for (int i = 0; i < Usuarios.size(); i++) {
                Usuarios temp = Usuarios.get(i);
                if (Usuarios.get(i).getCont().equals(password)) {
                    pass_ver = true;
                }
            }

            while (pass_ver == false || us_ver == false) {//verificacion de usuario y contraseña
                System.out.println("El nombre de usuario o el password esta incorrecto porfavor volver a intentar");
                System.out.println("Ingrese su Usuario");
                usuario = sc.next();
                System.out.println("Ingrese su Password");
                password = sc.next();

                for (int i = 0; i < Usuarios.size(); i++) {
                    Usuarios temp = Usuarios.get(i);
                    if (temp.getNom().equals(usuario)) {
                        us_ver = true;
                    }
                }
                for (int i = 0; i < Usuarios.size(); i++) {
                    Usuarios temp = Usuarios.get(i);
                    if (temp.getCont().equals(password)) {
                        pass_ver = true;
                    }
                }
            }

            int tip = 0;//Inicio asignacion de tipo

            if ("stud".equals(usuario)) {
                tip = 1;
            }
            if ("prof".equals(usuario)) {
                tip = 2;
            }
            if ("admin".equals(usuario)) {
                tip = 3;
            }
            String tipo = "";

            switch (tip) {
                case 1:
                    tipo = "est";
                    break;

                case 2:
                    tipo = "tch";
                    break;

                case 3:
                    tipo = "bib";
                    break;

            }// tipo de usuario asignado

            switch (tipo) {
                case "est"://menu estudiante
                    int res_men = 1;
                    while (res_men > 0 && res_men < 2) {
                        System.out.println("*****MENU*****");
                        System.out.println("1. Listar recursos");
                        System.out.println("2. Salir");
                        res_men = sc.nextInt();

                        if (res_men == 1) {//listar recursos
                            PrintLi(Libros);
                            PrintAr(Articulos);
                            PrintCu(Cursos);
                            PrintCon(Conferencias);
                        }//fin listar recursos
                    }
                    break;

                case "tch"://menu maestro
                    res_men = 1;
                    while (res_men > 0 && res_men < 3) {
                        System.out.println("*****MENU*****");
                        System.out.println("1. Listar recursos");
                        System.out.println("2. Crear recurso");
                        System.out.println("3. Salir");
                        res_men = sc.nextInt();

                        if (res_men == 1) {//listar recursos
                            PrintLi(Libros);
                            PrintAr(Articulos);
                            PrintCu(Cursos);
                            PrintCon(Conferencias);
                        }//fin listar recursos

                        if (res_men == 2) {//submenu para agregar recursos
                            System.out.println("*****SUBMENU*****");
                            System.out.println("1. Libro");
                            System.out.println("2. Articulos");
                            System.out.println("3. Cursos");
                            System.out.println("4. Conferencias");
                            System.out.println("5. Cancelar");
                            int res_sub = sc.nextInt();

                            switch (res_sub) {
                                case 1:
                                    String titulo;
                                    String autor;
                                    String genero;
                                    String año;
                                    char disponibilidad;

                                    System.out.println("Ingrese titulo del recurso: ");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese el genero: ");
                                    genero = sc.next();
                                    System.out.println("Ingrese el año en el que salio el recurso: ");
                                    año = sc.next();
                                    System.out.println("Ingrese si esta disponible o no [s/n]: ");
                                    disponibilidad = sc.next().charAt(0);

                                    Libros.add(new Libros(titulo, autor, genero, año, disponibilidad));
                                    System.out.println("Recurso agregado");
                                    break;

                                case 2:
                                    titulo = "";
                                    autor = "";
                                    String tema;
                                    String fecha;
                                    disponibilidad = 'n';

                                    System.out.println("Ingrese el titulo del recurso: ");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese de que trata: ");
                                    tema = sc.nextLine();
                                    System.out.println("Ingrese fecha de publicacion");
                                    fecha = sc.next();
                                    System.out.println("Ingrese si esta disponible o no [s/n]: ");
                                    disponibilidad = sc.next().charAt(0);

                                    Articulos.add(new Articulos(titulo, autor, tema, fecha, disponibilidad));
                                    System.out.println("Recurso agregado");
                                    break;

                                case 3:
                                    titulo = "";
                                    autor = "";
                                    int duracion;
                                    String plataforma;

                                    System.out.println("Ingrese el titulo del recurso: ");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese la duracion en semanas: ");
                                    duracion = sc.nextInt();
                                    System.out.println("Ingrese en que plataforma sera: ");
                                    plataforma = sc.next();

                                    Cursos.add(new Cursos(titulo, autor, duracion, plataforma));
                                    System.out.println("Recurso agregado");
                                    break;

                                case 4:
                                    titulo = "";
                                    autor = "";
                                    fecha = "";
                                    duracion = 0;
                                    String enlace;

                                    System.out.println("Ingrese el titulo del recurso");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el nombre del conferencista: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese el dia que se tomara la conferencia: ");
                                    fecha = sc.nextLine();
                                    System.out.println("Ingrese la duracion en horas: ");
                                    duracion = sc.nextInt();
                                    System.out.println("Ingrese el enlacede la conferencia: ");
                                    enlace = sc.nextLine();

                                    Conferencias.add(new Conferencias(titulo, autor, fecha, duracion, enlace));
                                    System.out.println("Recurso agregado");
                                    break;
                            }
                        }//fin agregar recursos
                    }
                    break;

                case "bib"://menu admin
                    res_men = 1;
                    while (res_men > 0 && res_men < 5) {
                        System.out.println("*****MENU*****");
                        System.out.println("1. Listar recursos");
                        System.out.println("2. Crear recurso");
                        System.out.println("3. Eliminar recurso");
                        System.out.println("4. Modificar recurso");
                        System.out.println("5. Salir");
                        res_men = sc.nextInt();
                        if (res_men == 1) {//listar recursos
                            PrintLi(Libros);
                            PrintAr(Articulos);
                            PrintCu(Cursos);
                            PrintCon(Conferencias);
                        }//fin listar recursos
                        if (res_men == 2) {//submenu para agregar recursos
                            System.out.println("*****SUBMENU*****");
                            System.out.println("1. Libro");
                            System.out.println("2. Articulos");
                            System.out.println("3. Cursos");
                            System.out.println("4. Conferencias");
                            System.out.println("5. Cancelar");
                            int res_sub = sc.nextInt();

                            switch (res_sub) {
                                case 1:
                                    String titulo;
                                    String autor;
                                    String genero;
                                    String año;
                                    char disponibilidad;

                                    System.out.println("Ingrese titulo del recurso: ");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese el genero: ");
                                    genero = sc.next();
                                    System.out.println("Ingrese el año en el que salio el recurso: ");
                                    año = sc.next();
                                    System.out.println("Ingrese si esta disponible o no [s/n]: ");
                                    disponibilidad = sc.next().charAt(0);

                                    Libros.add(new Libros(titulo, autor, genero, año, disponibilidad));
                                    System.out.println("Recurso agregado");
                                    break;

                                case 2:
                                    titulo = "";
                                    autor = "";
                                    String tema;
                                    String fecha;
                                    disponibilidad = 'n';

                                    System.out.println("Ingrese el titulo del recurso: ");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese de que trata: ");
                                    tema = sc.nextLine();
                                    System.out.println("Ingrese fecha de publicacion");
                                    fecha = sc.next();
                                    System.out.println("Ingrese si esta disponible o no [s/n]: ");
                                    disponibilidad = sc.next().charAt(0);

                                    Articulos.add(new Articulos(titulo, autor, tema, fecha, disponibilidad));
                                    System.out.println("Recurso agregado");
                                    break;

                                case 3:
                                    titulo = "";
                                    autor = "";
                                    int duracion;
                                    String plataforma;

                                    System.out.println("Ingrese el titulo del recurso: ");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el autor: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese la duracion en semanas: ");
                                    duracion = sc.nextInt();
                                    System.out.println("Ingrese en que plataforma sera: ");
                                    plataforma = sc.next();

                                    Cursos.add(new Cursos(titulo, autor, duracion, plataforma));
                                    System.out.println("Recurso agregado");
                                    break;

                                case 4:
                                    titulo = "";
                                    autor = "";
                                    fecha = "";
                                    duracion = 0;
                                    String enlace;

                                    System.out.println("Ingrese el titulo del recurso");
                                    sc.nextLine();
                                    titulo = sc.nextLine();
                                    System.out.println("Ingrese el nombre del conferencista: ");
                                    autor = sc.nextLine();
                                    System.out.println("Ingrese el dia que se tomara la conferencia: ");
                                    fecha = sc.nextLine();
                                    System.out.println("Ingrese la duracion en horas: ");
                                    duracion = sc.nextInt();
                                    System.out.println("Ingrese el enlacede la conferencia: ");
                                    enlace = sc.nextLine();

                                    Conferencias.add(new Conferencias(titulo, autor, fecha, duracion, enlace));
                                    System.out.println("Recurso agregado");
                                    break;
                            }
                        }//fin agregar recursos

                        if (res_men == 3) {//eliminar recursos
                            System.out.println("*****SUBMENU*****");
                            System.out.println("1. Libros");
                            System.out.println("2. Articulos");
                            System.out.println("3. Cursos");
                            System.out.println("4. Conferencias");
                            System.out.println("5. Cancelar");
                            int res_sub = sc.nextInt();

                            switch (res_sub) {
                                case 1:
                                    PrintLi(Libros);
                                    System.out.println("Eliga la posicion del libro que le gustaria eliminar: ");
                                    int pos_lib = sc.nextInt();
                                    if (pos_lib >= 0 && pos_lib < Libros.size()) {
                                        Libros.remove(pos_lib);
                                    } else {
                                        System.out.println("No existe un recurso en esa posicion");
                                    }
                                    break;
                                case 2:
                                    PrintAr(Articulos);
                                    System.out.println("Eliga la posicion del libro que le gustaria eliminar: ");
                                    int pos_art = sc.nextInt();
                                    if (pos_art >= 0 && pos_art < Articulos.size()) {
                                        Articulos.remove(pos_art);
                                    } else {
                                        System.out.println("No existe un recurso en esa posicion");
                                    }
                                    break;
                                case 3:
                                    PrintCu(Cursos);
                                    System.out.println("Eliga la posicion del libro que le gustaria eliminar: ");
                                    int pos_cur = sc.nextInt();
                                    if (pos_cur >= 0 && pos_cur < Cursos.size()) {
                                        Cursos.remove(pos_cur);
                                    } else {
                                        System.out.println("No existe un recurso en esa posicion");
                                    }
                                    break;
                                case 4:
                                    PrintCon(Conferencias);
                                    System.out.println("Eliga la posicion del libro que le gustaria eliminar: ");
                                    int pos_con = sc.nextInt();
                                    if (pos_con >= 0 && pos_con < Conferencias.size()) {
                                        Conferencias.remove(pos_con);
                                    } else {
                                        System.out.println("No existe un recurso en esa posicion");
                                    }
                                    break;

                            }
                        }//fin eliminar recursos

                        if (res_men == 4) {//modificar recursos

                        }//fin modificar recursos
                    }
                    break;
            }

            System.out.println("Desea volver a ingresar al programa? [s/n]: ");
            res_us = sc.next().charAt(0);
        }

    }

    public static void PrintLi(ArrayList x) {
        System.out.println("Libros:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ".- " + x.get(i).toString());
        }

    }

    public static void PrintAr(ArrayList x) {
        System.out.println("Articulos:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ".- " + x.get(i).toString());
        }

    }

    public static void PrintCu(ArrayList x) {
        System.out.println("Cursos:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ".- " + x.get(i).toString());
        }

    }

    public static void PrintCon(ArrayList x) {
        System.out.println("Conferencias:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ".- " + x.get(i).toString());
        }

    }

//    public static void PrintUs(ArrayList x) {
//        System.out.println("Usuarios:");
//        for (int i = 0; i < x.size(); i++) {
//            System.out.println(x.get(i).toString());
//        }
//
//    }
}
