package org.example.aspect.concert;

public interface Performance {
//    execution(* concert.Performance.perform(..))&& within(concert.*))
//    // Selecting beans in pointcuts
//    execution(* concert.Performance.perform())and bean('woodstock')
//    execution(* concert.Performance.perform())and !bean('woodstock')
    void perform();
}