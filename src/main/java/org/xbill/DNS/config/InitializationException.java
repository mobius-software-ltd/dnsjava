// SPDX-License-Identifier: BSD-3-Clause
package org.xbill.DNS.config;

public class InitializationException extends Exception {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

InitializationException(String message) {
    super(message);
  }

  InitializationException(Exception e) {
    super(e);
  }
}
