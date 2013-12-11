package com.svenjacobs.gwtbootstrap3.client.ui;

/*
 * #%L
 * GwtBootstrap3
 * %%
 * Copyright (C) 2013 Sven Jacobs
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

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeUri;
import com.svenjacobs.gwtbootstrap3.client.ui.base.helper.StyleHelper;
import com.svenjacobs.gwtbootstrap3.client.ui.constants.ImageType;

/**
 * @author Joshua Godi
 */
public class Image extends com.google.gwt.user.client.ui.Image implements HasType<ImageType>, HasResponsiveness {

    public Image() {
        super();
        setStyleName("");
    }

    public Image(final ImageResource resource) {
        super(resource);
        setStyleName("");
    }

    public Image(final SafeUri url, final int left, final int top, final int width, final int height) {
        super(url, left, top, width, height);
        setStyleName("");
    }

    public Image(final SafeUri url) {
        super(url);
        setStyleName("");
    }

    public Image(final String url, final int left, final int top, final int width, final int height) {
        super(url, left, top, width, height);
        setStyleName("");
    }

    public Image(final String url) {
        super(url);
        setStyleName("");
    }

    @Override
    public void setType(final ImageType type) {
        StyleHelper.addEnumStyleName(this, type);
    }

    @Override
    public ImageType getType() {
        return ImageType.fromStyleName(getStyleName());
    }

    @Override
    public void setVisibleOn(final String deviceSizeString) {
        StyleHelper.setVisibleOn(this, deviceSizeString);
    }

    @Override
    public void setHiddenOn(final String deviceSizeString) {
        StyleHelper.setHiddenOn(this, deviceSizeString);
    }
}