-- Create table for one-to-one relationship between mentors and mentors long term availabilities

CREATE TABLE IF NOT EXISTS mentor_long_term_availability
(
    mentor_id  INTEGER NOT NULL REFERENCES mentors (mentor_id) ON DELETE CASCADE,
    num_mentee INTEGER NOT NULL,
    hours      INTEGER,
    PRIMARY KEY (mentor_id)
);