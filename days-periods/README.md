# Days Periods Support

* Java 16
* [JDK-8247781](https://bugs.openjdk.java.net/browse/JDK-8247781)
* Precursor to bigger CLDR fix in Java 19

For readers not already familiar with [The Unicode Common Locale
Data Repository (CLDR)](https://cldr.unicode.org/), it "provides key
building blocks for software to support the world's languages, with
the largest and most extensive standard repository of locale data
available." For more details, please go read the details available
at [the CLDR website](https://cldr.unicode.org/).

## What is _Days Periods_?

In simple terms, we usually use time of day symbols a.m. (ante
meridiem) to describe morning hours or p.m. (post meridiem) to
describe afternoon and evening hours. These are Latin terms to
describe "before noon" and "after noon," however, sometimes it is
more beneficial or desirable to discuss time as "in the morning" or
"in the afternoon".

These alternative interpretations to "a.m." and "p.m." are what are
referred to as _days periods_ in this module and in this JDK bug
fix.

## What is this bug fix introduced in JDK 16?

There's only am/pm pattern symbol 'a' is available in the
`DateTimeFormatter` class. This enhancement extends the support of
day periods beyond am/pm, which is compatible with CLDR's 'B'
pattern.

## Default CLDR day periods

CLDR is intended for internationalization of day period data, so
time ranges and text obviously will change among different languages
and different locales.

Since I'm American and perform all my development exclusively in
English, I nearly always use the **en_US** locale. As such, here
are the default CLDR day periods and time ranges for those day
periods delivered by default with Java 17 for the **en_US** locale:

| Day Period | Time or Time Range  |
|------------|---------------------|
| Midnight   | 12:00 am            |
| Noon       | 12:00 pm            |
| Morning    | 6:00 am to 12:00 pm |
| Afternoon  | 12:00 pm to 6:00 pm |
| Evening    | 6:00 pm to 9:00 pm  |
| Night      | 9:00 pm to 6:00 am  |

## To use this module

Run the `DayTimeExample` class in the `org.example` package and
observe the output in the logs to see examples of time of day
output with and without the 'B' pattern to see how the output
changes for _days periods_.
