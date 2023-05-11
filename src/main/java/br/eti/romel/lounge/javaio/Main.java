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
package br.eti.romel.lounge.javaio;

import br.eti.romel.lounge.javaio.entradas.Interativa;
import br.eti.romel.lounge.javaio.entradas.Lote;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
public class Main {

    public static void main(String[] args) {

        if (args.length > 0) {
            for (String nomeArquivo : args) {
                File arquivo = new File(nomeArquivo);

                if (arquivo.canRead()) {
                    Lote.entradas(arquivo.toPath());
                } else {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE,
                            "O arquivo {} não pode ser lido.",
                            nomeArquivo);
                }
            }
        } else {
            Interativa.entradas();
        }
    }
}
