package com.wcc.platform.domain.cms.pages.mentorship;

import java.time.Month;

/**
 * Availability of the mentor per month.
 *
 * @param month which months eg: MAY, JUNE
 * @param hours number of hours available eg: 2
 */
public record MentorAdHocAvailability(Month month, Integer hours) {}
