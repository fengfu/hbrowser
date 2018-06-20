package hbrowser.ui;

import java.util.HashMap;
import java.util.Map;

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
 */
public class UIUpdateHandler {

    private static Map<String, Boolean> states;

    private UIUpdateHandler() {
    }

    static {
        states = new HashMap<String, Boolean>();
    }

    public static boolean enter(String method) {
        if (states.containsKey(method)) {
            return false;
        }

        states.put(method, true);
        return true;
    }

    public static void leave(String method) {
        states.remove(method);
    }
}
