/*******************************************************************************
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/

package com.liferay.ide.ui.wizard;

import com.liferay.ide.ui.wizard.StringArrayTableWizardSection.StringArrayDialogCallback;

import org.eclipse.swt.widgets.Text;

/**
 * Implementation of the <code>StringArrayDialogCallback</code> interface for both "Initialization Parameters" and
 * "URL Mappings" table views.
 * 
 * @author Gregory Amerson
 */
public class StringArrayTableWizardSectionCallback implements StringArrayDialogCallback
{

    /**
     * The first text field should not be empty.
     */
    public boolean validate( Text[] texts )
    {
        if( texts.length > 0 )
        {
            return texts[0].getText().trim().length() > 0;
        }
        return true;
    }

    /**
     * Trims the text values.
     */
    public String[] retrieveResultStrings( Text[] texts )
    {
        int n = texts.length;
        String[] result = new String[n];
        for( int i = 0; i < n; i++ )
        {
            result[i] = texts[i].getText().trim();
        }
        return result;
    }

}
