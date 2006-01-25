/******************************************************************************
 * Copyright (c) 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/


package org.eclipse.emf.validation.service;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;


/**
 * <p>
 * An {@link IValidator} that supports live-mode validation of
 * {@link org.eclipse.emf.common.notify.Notification}s.
 * </p>
 * <p>
 * Not intended to be implemented by clients.
 * </p>
 *
 * @see org.eclipse.emf.validation.service.ModelValidationService#newValidator(EvaluationMode)
 * @see org.eclipse.emf.validation.model.EvaluationMode#LIVE
 * 
 * @author Christian W. Damus (cdamus)
 */
public interface ILiveValidator extends IValidator {
	/**
	 * Validates the specified {@link Notification EMF event}.  This method is a
	 * synonym for the inherited {@link IValidator#validate(Object)}.
	 * 
	 * @param notification the EMF event to validate
	 * @return the validation status
	 * @see IValidator#validate(Object)
	 */
	IStatus validate(Notification notification);
	
	/**
	 * {@inheritDoc}
	 * 
	 * @param object must be a {@link Notification}
	 * @throws ClassCastException if <code>object</code> is not a
	 *      {@link Notification}
	 */
	IStatus validate(Object object);
}
