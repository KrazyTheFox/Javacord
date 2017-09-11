/*
 * Copyright (C) 2017 Bastian Oppermann
 * 
 * This file is part of Javacord.
 * 
 * Javacord is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser general Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 * 
 * Javacord is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, see <http://www.gnu.org/licenses/>.
 */
package de.btobastian.javacord.events;

import de.btobastian.javacord.DiscordApi;

/**
 * The basic event.
 */
public abstract class Event {

    /**
     * The api instance of the event.
     */
    protected final DiscordApi api;

    /**
     * Creates a new event.
     *
     * @param api The api instance of the event.
     */
    public Event(DiscordApi api) {
        this.api = api;
    }

    /**
     * Gets the api instance of the event.
     *
     * @return The api instance of the event.
     */
    public DiscordApi getApi() {
        return api;
    }

}
