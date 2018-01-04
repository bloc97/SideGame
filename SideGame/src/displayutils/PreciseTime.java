/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayutils;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author bowen
 */
public class PreciseTime {
    private final static TimeUnit INSTANCE = TimeUnit.NANOSECONDS;
    
    public long nanos = 0;
    
    public PreciseTime(long time, TimeUnit unit) {
        nanos = unit.toNanos(time);
    }
    
    public long getNanos() {
        return nanos;
    }
    
    public long getMicros() {
        return INSTANCE.toMicros(nanos);
    }
    
    public long getMilis() {
        return INSTANCE.toMillis(nanos);
    }
    
    public long getSeconds() {
        return INSTANCE.toSeconds(nanos);
    }
    
}
