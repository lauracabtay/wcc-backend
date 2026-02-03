package com.wcc.platform.domain.cms.pages.mentorship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Month;
import org.junit.jupiter.api.Test;

class MentorAdHocAvailabilityTest {

  @Test
  void testAvailabilityRecord() {
    Month month = Month.of(5);
    Integer hours = 2;

    MentorAdHocAvailability mentorAdHocAvailability = new MentorAdHocAvailability(month, hours);

    assertEquals("MAY", mentorAdHocAvailability.month().toString());
    assertEquals(hours, mentorAdHocAvailability.hours());
  }
}
