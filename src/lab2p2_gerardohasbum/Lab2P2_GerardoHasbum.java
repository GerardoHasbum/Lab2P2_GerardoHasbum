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
        
        Usuarios.add(new Usuarios("admin","123","est"));
        
        Libros.add(new Libros("Harry Potter and the Goblet of Fire", "J.K. Rowling", 'f', "2000", 's'));
        Articulos.add(new Articulos("Aprecio Familiar", "Discord", "Violencia Intrafamiliar", "solo dios sabe", 's'));
        Cursos.add(new Cursos("Si existo", "Dios", 200, "Youtube"));
        Conferencias.add(new Conferencias("QUE SI EXISTO", "Dios", "1/26/2024", 2, "googlemeets.com/si"));
        
        PrintLi(Libros);
        PrintAr(Articulos);
        PrintCu(Cursos);
        PrintCon(Conferencias);
        PrintUs(Usuarios);
        
    }
    
    public static void PrintLi(ArrayList x){
        System.out.println("Libros:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }
        
    }
    
    
    public static void PrintAr(ArrayList x){
        System.out.println("Articulos:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }
        
    }
    
    
    public static void PrintCu(ArrayList x){
        System.out.println("Cursos:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }
        
    }
    
    
    public static void PrintCon(ArrayList x){
        System.out.println("Conferencias:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }
        
    }
    
    
    public static void PrintUs(ArrayList x){
        System.out.println("Usuarios:");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }
        
    }
    
}
