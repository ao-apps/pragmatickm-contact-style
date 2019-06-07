/*
 * pragmatickm-contact-style - Default style for contacts nested within SemanticCMS pages and elements.
 * Copyright (C) 2016, 2017  AO Industries, Inc.
 *     support@aoindustries.com
 *     7262 Bull Pen Cir
 *     Mobile, AL 36695
 *
 * This file is part of pragmatickm-contact-style.
 *
 * pragmatickm-contact-style is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * pragmatickm-contact-style is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with pragmatickm-contact-style.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.pragmatickm.contact.style;

import com.pragmatickm.contact.model.Contact;
import com.semanticcms.core.servlet.SemanticCMS;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("Registers the styles for contacts in SemanticCMS.")
public class ContactStyleContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		SemanticCMS semanticCMS = SemanticCMS.getInstance(event.getServletContext());
		// Add our CSS file
		semanticCMS.addCssLink("/pragmatickm-contact-style/styles.css");
		// Add link CSS class
		semanticCMS.addLinkCssClass(Contact.class, "pragmatickm-contact-link");
		// Add list item CSS class
		semanticCMS.addListItemCssClass(Contact.class, "pragmatickm-contact-list-item");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// Do nothing
	}
}
