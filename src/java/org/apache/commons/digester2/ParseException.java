/* $Id$
 *
 * Copyright 2001-2005 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 


package org.apache.commons.digester2;

/**
 * An exception indicating that some problem occurred during parsing of
 * the input xml.
 */

public class ParseException extends DigestionException {
    public ParseException(String msg) {
        super(msg);
    }

    public ParseException(Throwable t) {
        super(t);
    }
    
    public ParseException(String msg, Throwable t) {
        super(msg, t);
    }
}
