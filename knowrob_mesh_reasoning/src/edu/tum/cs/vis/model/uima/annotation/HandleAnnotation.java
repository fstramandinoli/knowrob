/*******************************************************************************
 * Copyright (c) 2012 Stefan Profanter. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU Public License v3.0 which accompanies
 * this distribution, and is available at http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: Stefan Profanter - initial API and implementation, Year: 2013
 ******************************************************************************/
package edu.tum.cs.vis.model.uima.annotation;

import edu.tum.cs.vis.model.uima.annotation.primitive.Cone;

/**
 * @author Stefan Profanter
 * 
 */
public interface HandleAnnotation {
	public float getAreaCoverage();

	public Cone getCone();
}