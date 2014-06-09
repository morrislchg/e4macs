/**
 * Copyright (c) 2009, 2010 Mark Feber, MulgaSoft
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.mulgasoft.emacsplus.commands;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Insert blank space to fill the space of the region-rectangle (`open-rectangle').
 * This pushes the previous contents of the region-rectangle rightward.
 * 
 * @author Mark Feber - initial API and implementation
 */
public class RectangleOpenHandler extends RectangleHandler {

	/**
	 * @see com.mulgasoft.emacsplus.commands.EmacsPlusCmdHandler#transform(org.eclipse.ui.texteditor.ITextEditor, org.eclipse.jface.text.IDocument, org.eclipse.jface.text.ITextSelection, org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	protected int doTransform(ITextEditor editor, IDocument document,
			ITextSelection currentSelection)
			throws BadLocationException {
		int result = NO_OFFSET;
		result = updateRectangle(editor, document, getImpliedSelection(editor,currentSelection), null, false);		
		return result;
	}
}