# QuantityMeasurementApp
____________________________________________________________________________________________________________________________________________

This log documents the daily progress of tasks completed during the Quantity Measurement App development, identifying work done on each date 
with thematic headings and detailed summaries.
____________________________________________________________________________________________________________________________________________


Folder Structure
The repository is organized in a modular way following the standard Maven directory structure.

Currently, the application code resides in the src/main/java directory, and the test code resides in the src/test/java directory.


```
QuantityMeasurementApp/
|
+-- src/main/java (Application Code)
|
+-- src/test/java (Test Cases)
|
+-- pom.xml (Maven Configuration)
|
+-- README.md
```


Week 1: Quantity Measurement System
TDD Approach & Unit Conversion

_______________________________________________________________________________________________________________________________________________

- 18-Feb-2026 (Wednesday): Created the repository and set up the project structure. Started implementing the Quantity Measurement System using 
Test Driven Development (TDD). Addressed UC1 (Feet Equality) to handle feet measurement comparisons. Extended functionality to support Inches
Equality (UC2), allowing comparison of inch values with 100% test coverage.


     [Browse UC1 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC1-FeetEquality)  
     [Browse UC2 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC2-FeetAndInchesMeasurementEquality)

_______________________________________________________________________________________________________________________________________________

- 19-Feb-2026 (Thursday): Refactored the code to use a generic Quantity class and LengthUnit enum (UC3), implementing the DRY principle. Extended 
the system to support Yard and Centimeter units (UC4) with comprehensive test coverage for cross-unit comparisons.

     [Browse UC3 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC3-GenericQuantity)  
     [Browse UC4 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC4-ExtendedUnitSupport)

________________________________________________________________________________________________________________________________________________

- 09-March-2026 (Monday): Implemented unit-to-unit conversions between different length units (UC5). Added convert() and convertTo() methods to the Quantity class and ensured robust input validation and floating-point precision compatibility across comprehensive test cases

  [Browse UC5 Implimentation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC5-UnitConversion)

_________________________________________________________________________________________________________________________________________________

- 09-Mar-2026 (Monday): Expanded system capabilities drastically by adding quantity addition (UC6 & UC7), improving entity cohesion by refactoring LengthUnit (UC8), supporting a secondary WeightUnit category (UC9), and finally refactoring the entire architecture to completely generic Quantity<U extends IMeasurable> bounds, solving categorical duplication (UC10).

  [Browse UC6 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC6-Addition) <br>
  [Browse UC7 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC7-AdditionWithTargetUnit) <br>
  [Browse UC8 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC8-EnumRefactoring) <br>
  [Browse UC9 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC9-WeightMeasurement) <br>
  [Browse UC10 Implementation](https://github.com/shyam8439438655/QuantityMeasurementApp/tree/feature/UC10-GenericQuantity) <br>
