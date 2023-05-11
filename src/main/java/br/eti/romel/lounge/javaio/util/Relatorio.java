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
package br.eti.romel.lounge.javaio.util;

/**
 *
 * @author Carlos Romel Pereira da Silva, carlos.romel@gmail.com
 */
public class Relatorio {

    public static void cabecalho(String origem) {
        System.out.printf("Origem dos dados..............: [%s]%n", origem);
    }

    public static void registro(Double diametro, Double altura) {
        /*
         * Superfície: 2πr
         * Diâmetro..: 2π
         * Volume....: πr²h
         */
        Double volume = Math.PI * Math.pow(diametro / 2, 2) * altura;

        System.out.printf("Altura........................: %7.2fm%n", altura);
        System.out.printf("Diâmetro......................: %7.2fm%n", diametro);
        System.out.printf("Volume........................: %7.2fL%n", volume);
    }
}
