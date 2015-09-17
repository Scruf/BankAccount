Lab - Bank Account Manager
==========================

* * * * *

Introduction
------------

The local bank offers various types of accounts, some of which pay
interest dividends and others that do not. For example, this bank offers

-   savings accounts, which offer a flat, simple rate of interest;
-   certificates of deposit (CDs) that pay interest on the balance above
    some minimum;
-   checking accounts, some of which pay interest just like a savings
    account, but only if set up that way.

You will implement a bank simulation that will track various types of
accounts and generate a report of the interest paid (or \$0.00 if none)
and the current balance of each account. All accounts must appear on the
report. The report will consist of the following information for each
account: owner name, interest paid, and current balance. At the end of
the report, display the totals of the last two amounts across all
balances.

* * * * *

The Problem Solving Session
---------------------------

With your team members, answer the following questions and submit to
your instructor before you leave the problem solving session today:

1.  Think about the account types: Savings, CD, and Checking with or
    without interest. What attributes and operations are similar for all
    account types?
2.  What attributes and operations are different or unique for each
    account type? Draw a class diagram for each class.
3.  On your class diagrams, show the relationships between the classes.
    To keep things simple, we'll assume that the bank only needs to
    track the information generated in the report: the account owner's
    name, the interest paid, and the current balance.
4.  In the simulation you will implement, each account will only have
    its interest computed once, but conceivably these computations could
    be done over and over as time went by. How will you implement your
    classes' methods?

* * * * *

Implementation
--------------

Now that you have had some experience designing your own classes, we
want you to implement a solution using our design. This will involve
implementing all three account types (a class for each), and the
simulation program. Since we want to build the is\_a relationship
between the account types, we'll use a super class -- in this case an
*abstract* class.

As you saw from the problem solving session, all account types have a
lot in common. One commonality is that all accounts must report the
amount of interest paid. We will designate that method to be *abstract*
because we don't know how each account will calcualte the interest -
we'll leave that to the implementing class to specify.

In addition to the BankAccount classes, you will also write a test
program, `TestBankAccount.java` that will test your implementation (see
below).

### Java Documentation

Take a moment to familiarize yourself with the program design by
reviewing the [javadocs](./Doc/index.html). The project contains five
different classes. You are to write all five classes, based on their
javadoc specifications.

-   [BankAccount](./Doc/BankAccount.html) - An abstract class that
    represents an account.
-   [CheckingAccount](./Doc/CheckingAccount.html),
    [SavingsAccount](./Doc/SavingsAccount.html),
    [CDAccount](./Doc/CDAccount.html) - Concrete subclasses of
    `BankAccount` that each implement their own unique `calcInterest`
    behavior.
-   [The Test Program](./Doc/TestBankAccount.html) - The class which
    tests all classes and generates a sample interest report.

### Design Details

These classes and their relationships can be visualized in the following
[UML](http://en.wikipedia.org/wiki/Unified_Modeling_Language) diagram.
Notice that we are showing you the recommended state for each of the
classes. **You are free to represent the state of your classes however
you choose, but do not duplicate state unnecessarily!**

![](Media/ClassDiagram.png)

### Implementation Details

For this lab, we are providing only the javadocs. You will implement a
solution for all the classes, including:

1.  `BankAccount.java` the abstract class.
2.  The three subclasses of BankAccount:

    `CDAcount.java` The Certificate of Deposit class.

    `CheckingAccount.java` The Checking Account class.

    `SavingsAcount.java` The Savings Account class.

3.  You will also write a test class, `TestBankAccount.java`. Your test
    class must create ONE data structure (you decide - an array,
    LinkedList, ArrayList, ...), fill it with 5-10 different accounts,
    and generate the interest report.

    Note that each class contains a `toString() ` method. You may find
    this method helpful in your testing, but you should use the
    `printStatement()` method when generating your report.

    For tips on how to format your output, check this link: [How To
    Format Data](./NumericFormats.html).

    A sample run of the program is [here](./output.txt) (incorrect
    values). [This](Doc/output.txt) is an example of the correct output.

* * * * *

