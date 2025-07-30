// SPDX-License-Identifier: BSD-3-Clause
package org.xbill.DNS;

/** Indicates that converting a {@link Message} to wire format exceeded the maximum length. */
public final class MessageSizeExceededException extends Exception {
  private static final long serialVersionUID = 1L;

  /** Gets the maximum allowed size (in bytes). */
  private final int maxSize;

  MessageSizeExceededException(int maxSize) {
    super("Message size would exceed the allowed maximum of " + maxSize + " bytes");
    this.maxSize = maxSize;
  }

  public int getMaxSize() {
	return maxSize;
  }    
}
