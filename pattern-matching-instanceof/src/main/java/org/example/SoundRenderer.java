package org.example;

public class SoundRenderer {
  public String getSound(final Object thing) {
    if (thing instanceof Car car) {
      return car.makesSound();
    } else if (thing instanceof Cow cow) {
      return cow.moo();
    } else if (thing instanceof ExplosiveCharge explosiveCharge) {
      return explosiveCharge.detonate();
    } else if (thing instanceof FriendlyPerson friendlyPerson) {
      return friendlyPerson.says();
    } else {
      return String.format("I have no idea what sound a '%s' makes.", thing.getClass().getSimpleName());
    }
  }
}