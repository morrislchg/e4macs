/**
 * Copyright (c) 2009, 2010 Mark Feber, MulgaSoft
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.mulgasoft.emacsplus.minibuffer;

import org.eclipse.swt.events.VerifyEvent;

/**
 * @author Mark Feber - initial API and implementation
 *
 */
public class KbdMacroNameMinibuffer extends TextMinibuffer {

	/**
	 * @param executable
	 */
	public KbdMacroNameMinibuffer(IMinibufferExecutable executable) {
		super(executable);
	}

	/**
	 * Disallow spaces in macro name
	 * 
	 * @see com.mulgasoft.emacsplus.minibuffer.WithMinibuffer#charEvent(org.eclipse.swt.events.VerifyEvent)
	 */
	protected void charEvent(VerifyEvent event) {
		noSpaceCharEvent(event);
	}
}
