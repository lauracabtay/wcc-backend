package com.wcc.platform.domain.cms.pages.mentorship;

import java.util.List;
import lombok.Getter;

/** Represents the availability for both Long-Term and Ad-Hoc mentorship types. */
// public record MentorOverallAvailability(
//    MentorLongTermAvailability longTerm, List<MentorAdHocAvailability> adHoc) {}
@Getter
public class MentorOverallAvailability {

  MentorLongTermAvailability longTermAvailability;
  List<MentorAdHocAvailability> adHocAvailability;

  public MentorOverallAvailability(
      MentorLongTermAvailability longTermAvailability,
      List<MentorAdHocAvailability> adHocAvailability) {
    this.longTermAvailability = longTermAvailability;
    this.adHocAvailability = adHocAvailability;
  }
}
