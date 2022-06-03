package com.upchiapas.proyecto.modelos;
import java.util.Scanner;
import com.upchiapas.proyecto.modelos.Pizza;

public class Pedido {
    Scanner entrada = new Scanner(System.in);
    Cliente cliente1;
    Cliente[] registarCli;
    public void agregarPetido(){
        int turno=0;
        Pizza pizza=new Pizza();
       Cliente cliente=new Cliente();
        CatalogoPizza catalogo=new CatalogoPizza();
        catalogo.MostrarCatalogo();
        System.out.println("Pizza: ");
        int cantidaD;
        cantidaD=entrada.nextInt();
        for (int i = 0; i < cantidaD; i++) {
            System.out.println("ingrese su nombre ");
            String nom = entrada.next();
            cliente.setNombre(nom);
            System.out.println("agrega la cantidad de pizza");
            int cantidad = entrada.nextInt();
            pizza.setCantidad(cantidad);
            turno = +1;
            registarCli = new Cliente[2];
            cliente1 = new Cliente(nom, turno);
            registarCli[i] = cliente1;
            VisualizarParicipante(cantidaD);
            System.out.println("..................");
        }
        
    }
    public void VisualizarParicipante(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            System.out.println("nombre del cliente "+registarCli[i].getNombre());
          //  System.out.println("turno "+registarCli[i].getTurno());

        }
    }

}
