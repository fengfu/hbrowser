package hbrowser.format;

/**
 * Copyright (C) 2012 NICE Systems ltd.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Igor Cher
 * @version %I%, %G%
 *          <p/>
 *          A formatter interface to be used to format values into a {@link String}.
 */
public interface Formatter {

    /**
     * Converts a row to a {@link String} representation using specific formatting.
     *
     * @param value A value to append to a formatted string.
     */
    void append(Object value);

    /**
     * Gets a formatted string when all the relevant values were appended.
     *
     * @return A formatted string.
     */
    String getFormattedString();
}
