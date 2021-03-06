/*
Android Rivers is an app to read and discover news using RiverJs, RSS and OPML format.
Copyright (C) 2012 Dody Gunawinata (dodyg@silverkeytech.com)

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>
*/

package com.silverkeytech.android_rivers.syndications.atom;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Text;

public class ContentElement {

    @Text(required = false)
    //This violates specification but http://hosted2.ap.org/atom/APDEFAULT/3d281c11a96b4ad082fe88aa0db04305 sucks
    public String value;

    @Attribute(required = false)
    public String type;

    @Attribute(required = false)
    public String url;
}
