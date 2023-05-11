/*
 * Copyright (C) 2023 Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package br.eti.romel.lounge.javaio.entradas;

import br.eti.romel.lounge.javaio.util.Relatorio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
public class Interativa {

    public static void entradas() {
        Relatorio.cabecalho("Inerativo");

        try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader buffer = new BufferedReader(isr)) {
            while (true) {
                System.out.println("Para encerrar a rotina, deixe o próximo campo em branco.");

                System.out.printf("Informe o altura (em metros)..: ");
                String entradaUsuario = buffer.readLine();

                if (!entradaUsuario.isEmpty()) {
                    Double altura = Double.valueOf(entradaUsuario);

                    System.out.printf("Informe o diâmetro (em metros): ");
                    String entradausuario = buffer.readLine();
                    Double diametro = Double.valueOf(entradausuario);

                    Relatorio.registro(altura, diametro);
                } else {
                    break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Interativa.class.getName()).log(Level.SEVERE,
                    "O campo informado ẽ inválido.",
                    ex);
        }
    }
}
