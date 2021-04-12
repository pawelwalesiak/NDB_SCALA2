# NDB_SCALA_2
NBD zad2


Use pattern matching in a function accepting a String. For strings containing names of days of the week return “work” (Monday-Friday) or “weekend” ( for weekends). For all other strings return “no such day”

2. Define a BankAccount class with methods deposits and withdraw and currentBalance read only property. The class should provide a constructor accepting initial balance and second constructor, setting the balance to 0.

3. Define a Person class with properties firstName and lastName. Create a few instances. Define a function accepting Person instance and using pattern matching to select string greeting the person. Define 2-3 different greetings for people meeting specific criteria (eg. specific first or last name) and one generic greeting

4. Define a function accepting two parameters – integer and a function operating on integers. Apply the parameter function three times to the integer and return a result

5. Define a Person class and three traits: Student, Teacher, Employee. Person should have firstName, lastName and taxToPay read only properties. Employee should have a salary property (with getter and setter). Student and Employee traits should override taxToPay property – for Student it should return 0, for Employee it should return 20% of his salary. Teacher should inherit from employee, the taxToPay should return 10% of his salary. Create objects with each of the properites, show how their properties work. Create two objects with both the Student and Employee properties (add them in different order in each object), show how taxToPay will work with this object depending on the order those traits are added upon instantiation.
