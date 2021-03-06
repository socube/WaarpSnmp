/**
 * This file is part of Waarp Project.
 * 
 * Copyright 2009, Frederic Bregier, and individual contributors by the @author
 * tags. See the COPYRIGHT.txt in the distribution for a full listing of
 * individual contributors.
 * 
 * All Waarp Project is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 * 
 * Waarp is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * Waarp. If not, see <http://www.gnu.org/licenses/>.
 */
package org.waarp.snmp.test;

import org.waarp.common.logging.WaarpLogger;
import org.waarp.common.logging.WaarpLoggerFactory;
import org.waarp.snmp.WaarpSnmpAgent;
import org.waarp.snmp.interf.WaarpInterfaceMonitor;

/**
 * This implementation show how to support SNMP.
 * 
 * @author Frederic Bregier
 * 
 */
public class WaarpPrivateMonitor implements WaarpInterfaceMonitor {
    /**
     * Internal Logger
     */
    private static WaarpLogger logger = WaarpLoggerFactory
            .getLogger(WaarpPrivateMonitor.class);

    public WaarpSnmpAgent agent;

    /**
     * @return the agent
     */
    public WaarpSnmpAgent getAgent() {
        return agent;
    }

    /**
     * @param agent
     *            the agent to set
     */
    public void setAgent(WaarpSnmpAgent agent) {
        this.agent = agent;
    }

    public void initialize() {
        // TODO Auto-generated method stub
        logger.warn("Call");
    }

    public void releaseResources() {
        // TODO Auto-generated method stub
        logger.warn("Call");

    }

    /*
     * function to test if the computations need to be redone
     * 
     */
    public void generalValuesUpdate() {
        synchronized (agent) {
            // TODO Auto-generated method stub

            logger.warn("Call");
        }
    }

    public void detailedValuesUpdate() {
        synchronized (agent) {
            // TODO Auto-generated method stub
            logger.warn("Call");

        }
    }

    public void errorValuesUpdate() {
        synchronized (agent) {
            // TODO Auto-generated method stub
            logger.warn("Call");

        }
    }

}
