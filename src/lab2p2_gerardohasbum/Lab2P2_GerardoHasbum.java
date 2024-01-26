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

        Libros.add(new Libros("Harry Potter and the Goblet of Fire", "J.K. Rowling", 'f', "2000", 's'));
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

            while (pass_ver == false || us_ver == false) {
                System.out.println("El nombre de usuario o el password esta incorrecto porfavor volver a intentar");
                System.out.println("Ingrese su Usuario");
                usuario = sc.next();
                System.out.println("Ingrese su Password");
                password = sc.next();

                for (int i = 0; i < Usuarios.size(); i++) {
                    Usuarios temp = Usuarios.get(i);
                    if (temp.getNom() == usuario) {
                        us_ver = true;
                    }
                }
                for (int i = 0; i < Usuarios.size(); i++) {
                    Usuarios temp = Usuarios.get(i);
                    if (temp.getCont() == password) {
                        pass_ver = true;
                    }
                }
            }

            int tip = 0;//Inicio asignacion de tipo

            if ("stud".equals(usuario)) {
                tip =1;
            }
            if ("prof".equals(usuario)) {
                tip = 2;
            }
            if ("admin".equals(usuario)) {
                tip = 3;
            }
            String tipo = "";
            
            switch(tip){
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
            
            
            
            System.out.println("Desea volver a ingresar al programa? [s/n]: ");
            res_us = sc.next().charAt(0);
        }

        PrintLi(Libros);
        PrintAr(Articulos);
        PrintCu(Cursos);
        PrintCon(Conferencias);
        PrintUs(Usuarios);

    }

    public static void PrintLi(ArrayList x) {
        System.out.println("Libros:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }

    }

    public static void PrintAr(ArrayList x) {
        System.out.println("Articulos:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }

    }

    public static void PrintCu(ArrayList x) {
        System.out.println("Cursos:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }

    }

    public static void PrintCon(ArrayList x) {
        System.out.println("Conferencias:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }

    }

    public static void PrintUs(ArrayList x) {
        System.out.println("Usuarios:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }

    }

}
