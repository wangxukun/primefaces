/**
 * Copyright 2009-2018 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.component.idlemonitor;

import javax.faces.component.UIComponentBase;
import javax.faces.component.behavior.ClientBehaviorHolder;
import org.primefaces.component.api.PrimeClientBehaviorHolder;
import org.primefaces.component.api.Widget;
import org.primefaces.util.ComponentUtils;


abstract class IdleMonitorBase extends UIComponentBase implements Widget, ClientBehaviorHolder, PrimeClientBehaviorHolder {

    public static final String COMPONENT_FAMILY = "org.primefaces.component";

    public static final String DEFAULT_RENDERER = "org.primefaces.component.IdleMonitorRenderer";

    public enum PropertyKeys {

        widgetVar,
        timeout,
        onidle,
        onactive,
        multiWindowSupport;
    }

    public IdleMonitorBase() {
        setRendererType(DEFAULT_RENDERER);
    }

    public String getFamily() {
        return COMPONENT_FAMILY;
    }

    public java.lang.String getWidgetVar() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.widgetVar, null);
    }

    public void setWidgetVar(java.lang.String _widgetVar) {
        getStateHelper().put(PropertyKeys.widgetVar, _widgetVar);
    }

    public int getTimeout() {
        return (java.lang.Integer) getStateHelper().eval(PropertyKeys.timeout, 300000);
    }

    public void setTimeout(int _timeout) {
        getStateHelper().put(PropertyKeys.timeout, _timeout);
    }

    public java.lang.String getOnidle() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.onidle, null);
    }

    public void setOnidle(java.lang.String _onidle) {
        getStateHelper().put(PropertyKeys.onidle, _onidle);
    }

    public java.lang.String getOnactive() {
        return (java.lang.String) getStateHelper().eval(PropertyKeys.onactive, null);
    }

    public void setOnactive(java.lang.String _onactive) {
        getStateHelper().put(PropertyKeys.onactive, _onactive);
    }

    public boolean isMultiWindowSupport() {
        return (java.lang.Boolean) getStateHelper().eval(PropertyKeys.multiWindowSupport, false);
    }

    public void setMultiWindowSupport(boolean _multiWindowSupport) {
        getStateHelper().put(PropertyKeys.multiWindowSupport, _multiWindowSupport);
    }

    public String resolveWidgetVar() {
        return ComponentUtils.resolveWidgetVar(getFacesContext(), this);
    }
}