/*--------------------------------------------------------------------------
 * Copyright (c) 2004, 2006-2007 OpenMethods, LLC
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Trip Gilman (OpenMethods), Lonnie G. Pryor (OpenMethods)
 *    - initial API and implementation
 -------------------------------------------------------------------------*/
package org.eclipse.vtp.framework.interactions.core.conversation;

/**
 * A message that displays data to the agent on the other end of a conversation.
 * 
 * @author Lonnie Pryor
 */
public interface IBridgeMessage extends IInteraction
{
	String TRANSFERRED = "transferred";
	String BUSY = "busy";
	String UNAVAILABLE = "unavailable";
	String NOAUTH = "noauthorization";
	String BADDEST = "baddestination";
	String NOROUTE = "noroute";
	String NORESOURCE = "noresource";
	String PROTOCOL = "protocol";
	String BADBRIDGE = "badbridge";
	String BADURI = "baduri";
}
