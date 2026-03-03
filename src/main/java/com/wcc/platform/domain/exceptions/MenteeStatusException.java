package com.wcc.platform.domain.exceptions;

/** Thrown when an operation cannot be performed due to the mentee's current status. */
public class MenteeStatusException extends RuntimeException {

  /**
   * Create exception with the given message.
   *
   * @param message description of the status conflict
   */
  public MenteeStatusException(final String message) {
    super(message);
  }
}
