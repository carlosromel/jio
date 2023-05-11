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
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
public class Lote {

    public static void entradas(Path arquivoEntrada) {
        Relatorio.cabecalho(String.format("arquivo: %s", arquivoEntrada.toString()));

        try {
            List<String> linhas = Files.readAllLines(arquivoEntrada);
            int numeroLinha = 1;

            for (String linha : linhas) {
                String[] valores = linha.split(";");

                if (valores.length > 1) {
                    Double altura = Double.valueOf(valores[0]);
                    Double diametro = Double.valueOf(valores[1]);

                    Relatorio.registro(diametro, altura);
                } else {
                    System.out.printf("Linha %d incompleta: (%s)%n", numeroLinha, linha);
                }

                ++numeroLinha;
            }
        } catch (IOException ex) {
            Logger.getLogger(Lote.class.getName()).log(Level.SEVERE,
                    "O conteúdo do arquivo {} não pode ser lido.",
                    arquivoEntrada.toUri());
        }
    }
}
