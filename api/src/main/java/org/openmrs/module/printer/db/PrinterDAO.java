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

package org.openmrs.module.printer.db;

import org.openmrs.module.emrapi.db.SingleClassDAO;
import org.openmrs.module.printer.Printer;
import org.openmrs.module.printer.PrinterType;

import java.util.List;

public interface PrinterDAO extends SingleClassDAO<Printer> {


    /**
     * Fetch a printer by name
     *
     * @param name
     * @return
     */
    Printer getPrinterByName(String name);


    /**
     * Fetches all printers of a specified type
     *
     * @param type
     * @return
     */
    List<Printer> getPrintersByType(PrinterType type);

    /**
     * Given a printer, returns true/false if that ip address is in use
     * by *another* printer
     *
     * @return
     */
    boolean isIpAddressAllocatedToAnotherPrinter(Printer printer);

    /**
     * Given a printer, returns true/false if that name is in use
     * by *another* printer
     *
     * @return
     */
    boolean isNameAllocatedToAnotherPrinter(Printer printer);

}
