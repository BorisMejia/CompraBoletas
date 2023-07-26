package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cedulaUsuario, nombreUsuario, apellidosUsuario, ciudadResidenciaUsuario;
        byte edadUsuario;
        int numeroBoletasCompradas;
        int valorBoleta = 450000;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Ingrese su apellido: ");
        apellidosUsuario=teclado.nextLine();

        System.out.print("Ingrese su cedula: ");
        cedulaUsuario=teclado.nextLine();

        System.out.print("Ingrese su ciudad de residencia: ");
        ciudadResidenciaUsuario=teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        edadUsuario=teclado.nextByte();

        System.out.print("Ingrese el numero de boletas compradas para el concierto: ");
        numeroBoletasCompradas=teclado.nextInt();

        if (edadUsuario<18){
            System.out.println("Querido "+nombreUsuario+ " usted no puede entrar al concierto por ser menor de edad " +edadUsuario);
            } else if (numeroBoletasCompradas>4) {
            System.out.println("Querido usuario usted no puede comprar mas de 4 boletas");
        }else {
            int valorTotal=numeroBoletasCompradas*valorBoleta;
            System.out.println(nombreUsuario +" "+ apellidosUsuario+ " con lugar de residente en la ciudad de "+ciudadResidenciaUsuario+ " identificado con C.C "+ cedulaUsuario+ " La cantidad gastada para el concierto fue " +valorTotal);
    }

    }
}