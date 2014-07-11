/*
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */

package org.openmrs.module.printer;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;

public class StringToPrinterConverter implements Converter<String, Printer> {

    @Autowired
    @Qualifier("printerService")
    private PrinterService printerService;

    @Override
    public Printer convert(String s) {
        if (StringUtils.isBlank(s)) {
            return null;
        }
        else {
            return printerService.getPrinterById(Integer.valueOf(s));
        }
    }
}
