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

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author w9101532
 */
public class CardCollection
{
    /**
     * Contains the cards for the collection.
     */
    private final ArrayList<Card> cards;

    /**
     * Constructor.
     */
    public CardCollection()
    {
        this.cards = new ArrayList<>();
    }

    /**
     * Gets the arraylist associated with the collection.
     * @return 
     */
    public ArrayList<Card> getCards()
    {
        return this.cards;
    }

    /**
     * Gets the selected card at index.
     * @param index     The index to locate the card.
     * @return          Returns the card object.
     */
    public Card getCard(int index)
    {
        return cards.get(index);
    }
    
    /**
     * Adds a card to the collection.
     * @param card     The card to be added.
     */
    public void add(Card card)
    {
        this.cards.add(card);
        this.sort();
    }
    
    /**
     * Removes a card from the collection.
     * @param card      Card to remove.
     */
    public void remove(Card card)
    {
        this.cards.remove(card);
    }

    /**
     * Removes all cards in the collection.
     * @param cards     Takes in an ArrayList of cards.
     */
    public void removeAll(ArrayList<Card> cards)
    {
        this.cards.removeAll(cards);
    }

    /**
     * Gets the collection's size.
     * @return    Returns the size of the collection.
     */
    public int count()
    {
        return this.cards.size();
    }

    /**
     * Sorts the collection.
     */
    public void sort()
    {
        Collections.sort(this.cards);
    }

    /**
     * Displays visually the card collection object.
     * @return      Returns the string built via this method.
     */
    @Override
    public String toString()
    {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.count(); i++)
        {
            sb.append("+-------+ ");
        }
        sb.append("\n");

        for (Card card : this.cards)
        {
            sb.append(String.format("|%7d| ", card.getManaCost()));
        }
        sb.append("\n");

        for (Card card : this.cards)
        {
            sb.append(String.format("|  %-5s| ", card.getId()));
        }
        sb.append("\n");

        for (int i = 0; i < this.count(); i++)
        {
            sb.append("|       | ");
        }
        sb.append("\n");

        for (Card card : this.cards)
        {
            sb.append(String.format("|%-2d %4d| ", card.getAttack(), card.getHealth()));
        }
        sb.append("\n");

        for (int i = 0; i < this.count(); i++)
        {
            sb.append("+-------+ ");
        }
        sb.append("\n");

        return sb.toString();
    }
}
