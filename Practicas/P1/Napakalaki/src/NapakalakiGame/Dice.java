/*
 * Copyright (C) 2015 nitrosito
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package NapakalakiGame;

import java.util.Random;

/**
 *
 * @author nitrosito
 */
public class Dice {
    
     private static final Dice instance = new Dice();
     
      private Dice(){
     // Aqui va la asignación de valores, etc
    }

    public static Dice getInstance(){
        return instance;
    }
    
    
    public int nextNumber(){
        Random rand = new Random();
        return (rand.nextInt((6 - 1) + 1) + 1);     
    }

}