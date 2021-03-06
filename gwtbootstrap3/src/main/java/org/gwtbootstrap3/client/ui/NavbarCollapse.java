package org.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 GwtBootstrap3
 * %%
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
 * #L%
 */

import com.google.gwt.dom.client.Element;
import org.gwtbootstrap3.client.ui.base.helper.StyleHelper;
import org.gwtbootstrap3.client.ui.constants.Styles;

/**
 * Container for collapsible items within a {@link Navbar}.
 *
 * @author Sven Jacobs
 * @author Joshua Godi
 * @see NavbarCollapseButton
 */
public class NavbarCollapse extends FlowPanel implements HasResponsiveness {

    public NavbarCollapse() {
        setStyleName(Styles.COLLAPSE);
        addStyleName(Styles.NAVBAR_COLLAPSE);
    }

    @Override
    public void setVisibleOn(final String deviceSizeString) {
        StyleHelper.setVisibleOn(this, deviceSizeString);
    }

    @Override
    public void setHiddenOn(final String deviceSizeString) {
        StyleHelper.setHiddenOn(this, deviceSizeString);
    }

    public void show() {
        command(getElement(), "show");
    }

    public void hide() {
        command(getElement(), "hide");
    }

    public void toggle() {
        command(getElement(), "toggle");
    }
    
    private native void command(final Element e, final String command) /*-{
        $wnd.jQuery(e).collapse(command);
    }-*/;

}
