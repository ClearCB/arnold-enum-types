# arnold-enum-types

IMPORTANT! All the starting information was provided by my teacher before doing the exam. (UML, userstories, etc.)

Repository to take a first look at the enum types in Java. The exercise consist in calculating the weight of something in each of the planets in our Solar System.

Initial statment: [dfleta](https://github.com/dfleta/arnold-enum-type)

Solution of my teacher: [solution](https://github.com/dfleta/Java/tree/master/arnoldEnumTypeMaven)

## KeyWords

* Enum types

## UserStories

```bash
$ // Your weight 
Your weight on MERCURY is 66.107583 
Your weight on VENUS is 158.374842 
Your weight on EARTH is 175.000000 
Your weight on MARS is 66.279007 
Your weight on JUPITER is 442.847567 
Your weight on SATURN is 186.552719 
Your weight on URANUS is 158.397260 
Your weight on NEPTUNE is 199.207413
```

## Additional information

Formulas:

* Gravity constant: G = 6.67300E-11
* Weight in surface: mass * gravitySurface
* gravitySurface: G * ( planteMass / planetRadious )
* mass: weigthInEarth / earthGravitySurface

Data about planets:

```txt
MERCURY (3.303e+23, 2.4397e6),     
VENUS   (4.869e+24, 6.0518e6),     
EARTH   (5.976e+24, 6.37814e6),     
MARS    (6.421e+23, 3.3972e6),     
JUPITER (1.9e+27,   7.1492e7),     
SATURN  (5.688e+26, 6.0268e7),     
URANUS  (8.686e+25, 2.5559e7),     
NEPTUNE (1.024e+26, 2.4746e7);   
```
