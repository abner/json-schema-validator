/*
 * Copyright (c) 2013, Francis Galiegue <fgaliegue@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.fge.jsonschema.messages;

public enum RefProcessingMessages
{
    INVALID_URI("not a valid URI"),
    URI_NOT_ABSOLUTE("URI is not absolute"),
    UNHANDLED_SCHEME("scheme not supported"),
    URI_NOT_JSON("content at URI is not valid JSON"),
    URI_IOERROR("cannot dereference URI (IOException)"),
    REF_LOOP("JSON Reference loop detected"),
    DANGLING_REF("unresolvable JSON Reference");

    private final String message;

    RefProcessingMessages(final String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return message;
    }
}