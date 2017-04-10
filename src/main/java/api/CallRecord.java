package api;

import java.time.Duration;
import java.time.ZonedDateTime;

public class CallRecord {
    private final Long id;
    private final ZonedDateTime startTime;
    private final ZonedDateTime endTime;
    private final Duration duration;
    private final String callerLineIdentity;
    private final String nonChargedParty;

    public CallRecord(
            Long id,
            ZonedDateTime startTime,
            ZonedDateTime endTime,
            Duration duration,
            String callerLineIdentity,
            String nonChargedParty
    ){
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.callerLineIdentity = callerLineIdentity;
        this.nonChargedParty = nonChargedParty;
    }

    public Long getId() {
        return id;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getCallerLineIdentity() {
        return callerLineIdentity;
    }

    public String getNonChargedParty() {
        return nonChargedParty;
    }
}
