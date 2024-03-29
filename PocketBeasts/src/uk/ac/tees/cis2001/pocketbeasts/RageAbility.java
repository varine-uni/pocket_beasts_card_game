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
public class RageAbility implements WarriorStateStrategy
{
    /**
     * Uses the chosen strategy. This strategy heals the Cyber Warrior for two points in the rage state.
     * @param war   Cyber Warrior object for use with strategies. (I.e access to health or attack).
     */
    @Override
    public void activateStrategy(Class_CyberWarrior war)
    {
        war.health += 2;
    }
}
