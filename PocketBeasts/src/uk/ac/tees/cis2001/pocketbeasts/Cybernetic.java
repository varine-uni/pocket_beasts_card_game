/*
 * This file is part of PocketBeasts.
 *
 * PocketBeasts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PocketBeasts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */
package uk.ac.tees.cis2001.pocketbeasts;

/**
 *
 * @author w9101532
 */
public class Cybernetic extends CyberneticDecorator
{
    /**
     * Basic decorator object that simply buffs the attack and health of a player's card.
     * Increases the cost of the card by 1 mana point.
     * @param card     Card object to wrap around.
     */
    public Cybernetic(Card card)
    {
        super(card);
        
        attack = 10;
        health = 10;
        id = "+";
        name = "";
        manaCost = 1;
    }
    
}
