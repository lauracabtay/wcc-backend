package com.wcc.platform.domain.cms.pages.mentorship;

/**
 * Represents the long-term availability of a mentor.
 *
 * @param numMentee number of mentees available for e.g. 1
 * @param hours number of hours available eg: 2
 */
public record MentorLongTermAvailability(Integer numMentee, Integer hours) {}
